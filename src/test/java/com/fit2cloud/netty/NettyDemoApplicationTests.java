package com.fit2cloud.netty;

import com.fit2cloud.netty.service.TagService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NettyDemoApplicationTests {
    @Resource
    private TagService tagService;

    @Test
    public void contextLoads() {
    }


}
