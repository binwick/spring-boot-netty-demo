package com.fit2cloud.netty.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class SessionUtils {

    /*public static SystemUser getUser() {
        Mono<Object> principal = ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getPrincipal);
        try {
            System.out.println(principal.toFuture().get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        Optional<Object> o = principal.blockOptional();
        return (SystemUser) o.orElse(null);
    }*/

    public static Mono<User> getUser() {
        return ReactiveSecurityContextHolder.getContext()
                .switchIfEmpty(Mono.error(new IllegalStateException("ReactiveSecurityContext is empty")))
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getPrincipal)
                .cast(User.class);
    }
}
