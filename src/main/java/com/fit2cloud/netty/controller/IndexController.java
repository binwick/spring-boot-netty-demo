package com.fit2cloud.netty.controller;

import com.fit2cloud.netty.service.TagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @Resource
    private TagService tagService;

    @GetMapping("/")
    public Mono<String> allMessages(WebSession session) {
        return Mono.just(session.getId());
    }
}


