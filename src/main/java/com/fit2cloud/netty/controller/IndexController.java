package com.fit2cloud.netty.controller;

import com.fit2cloud.netty.utils.SessionUtils;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.result.view.Rendering;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

@Controller
public class IndexController {

    //    @GetMapping("/")
//    public Mono<String> allMessages(WebSession session, Model model) {
//        model.addAttribute("sessionId", session.getId());
//        return Mono.create(s -> s.success("index"));
//    }

    /**
     * 返回页面的写法
     *
     * @param session 当前session
     * @return render page
     */
    @GetMapping("/")
    public Rendering index(WebSession session) {
        return Rendering.view("index")
                .modelAttribute("sessionId", session.getId()).build();
    }

    @GetMapping("/user")
    @ResponseBody
    public Mono<User> user() {
        Mono<String> then = SessionUtils.getUser().thenReturn("current user");
        return SessionUtils.getUser();
    }

    @GetMapping("/system/user")
    @ResponseBody
    public User user(@AuthenticationPrincipal User user) {
        return user;
    }
}


