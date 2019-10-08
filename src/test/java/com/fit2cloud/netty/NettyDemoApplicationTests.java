package com.fit2cloud.netty;

import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.service.UserService;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NettyDemoApplicationTests {
    @Resource
    private UserService userService;

    @Test
    public void contextLoads() {
        List<User> users = userService.selectUsers();
        users.forEach(user -> {
            System.out.println(user.getEmail());
        });
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 1);
        List<User> users = userService.selectUsers();
        users.forEach(u -> {
            System.out.println(u);
        });
    }

    @Test
    public void testRowBounds() {
        List<User> users = userService.selectUsersByRowBounds(new RowBounds(1, 1));
        System.out.println(users.size());
    }

    @Test
    public void testSelectUser() throws Exception {
        User user = userService.findUserById(1L);
        System.out.println(user.getName());
    }
}
