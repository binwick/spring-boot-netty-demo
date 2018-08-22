package com.fit2cloud.netty.controller;

import com.fit2cloud.netty.model.Plugin;
import com.fit2cloud.netty.service.PluginService;
import com.fit2cloud.netty.utils.SessionUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class PluginController {
    @Resource
    private PluginService pluginService;

    @GetMapping("plugins/{goPage}/{pageSize}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Flux<Plugin> tags(@PathVariable int goPage, @PathVariable int pageSize) {
        PageHelper.startPage(goPage, pageSize);
        return Flux.fromStream(pluginService.selectPlugins().stream());
    }

    @GetMapping("/user")
    public Mono<User> user() {
        return SessionUtils.getUser();
    }

    @GetMapping("/system/user")
    public User user(@AuthenticationPrincipal User user) {
        return user;
    }
}
