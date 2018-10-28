package com.fit2cloud.netty;

import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.service.UserService;
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


}
