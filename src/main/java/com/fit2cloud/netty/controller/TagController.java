package com.fit2cloud.netty.controller;

import com.fit2cloud.netty.model.Tag;
import com.fit2cloud.netty.service.TagService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
public class TagController {
    @Resource
    private TagService tagService;

    @GetMapping("tags")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Flux<Tag> tags() {
        return Flux.fromStream(tagService.getAllTags().stream());
    }
}
