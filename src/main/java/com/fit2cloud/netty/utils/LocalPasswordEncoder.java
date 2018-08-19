package com.fit2cloud.netty.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

public class LocalPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return "";
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return true;
    }
}
