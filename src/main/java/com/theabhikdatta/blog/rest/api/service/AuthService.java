package com.theabhikdatta.blog.rest.api.service;

import com.theabhikdatta.blog.rest.api.payload.LoginDto;
import com.theabhikdatta.blog.rest.api.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}
