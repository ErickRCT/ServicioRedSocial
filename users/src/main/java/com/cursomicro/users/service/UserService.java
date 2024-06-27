package com.cursomicro.users.service;

import com.cursomicro.users.dto.UserDto;

public interface UserService {

    UserDto findUserAndPosts(Long user_id);
}
