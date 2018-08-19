package com.fit2cloud.netty.controller;

import com.fit2cloud.netty.model.Plugin;
import com.fit2cloud.netty.service.PluginService;
import com.github.pagehelper.PageHelper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
public class PluginController {
    @Resource
    private PluginService pluginService;

    @GetMapping("plugins")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Flux<Plugin> tags() {
        PageHelper.startPage(1, 2);
        return Flux.fromStream(pluginService.selectPlugins().stream());
    }
}
