package com.cursomicro.users.controller;

import com.cursomicro.users.dto.UserDto;
import com.cursomicro.users.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/obtener/{user_id}")
    public UserDto findUserAndPosts(@PathVariable Long user_id){
        return userService.findUserAndPosts(user_id);
    }

}
