package com.fit2cloud.netty.service;

import com.fit2cloud.netty.dao.UserMapper;
import com.fit2cloud.netty.dao.ext.ExtUserMapper;
import com.fit2cloud.netty.model.SystemUser;
import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.model.UserExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService implements ReactiveUserDetailsService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private ExtUserMapper extUserMapper;

    public List<User> selectUsers() {
        return userMapper.selectByExample(null);
    }

    public List<User> selectUsersByRowBounds(RowBounds rowBounds) {
        return userMapper.selectByExampleWithRowbounds(null, rowBounds);
    }

    @Override
    public Mono<UserDetails> findByUsername(String username) {

        //根据用户名从数据库查询对应记录
        UserDetails systemUser = queryByUserName(username);
        if (systemUser == null) {
            throw new UsernameNotFoundException("username is not exists");
        }

        System.out.println("username is : " + systemUser.getUsername() + ", password is :" + systemUser.getPassword());
        return Mono.just(systemUser);
    }

    public User findUserById(Long id) throws Exception {
        return extUserMapper.findSelective(id).orElseThrow(() -> new Exception("user doesn't exists."));
    }

    private UserDetails queryByUserName(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() == 0) {
            return null;
        }
        // 添加权限
        User user = users.get(0);
        return SystemUser.withUsername(username)
                .password(user.getAccessToken())
                .authorities("ROLE_ADMIN")
                .build();
    }
}