package com.cursomicro.users.service;

import com.cursomicro.users.dto.PostDto;
import com.cursomicro.users.dto.UserDto;
import com.cursomicro.users.entity.User;
import com.cursomicro.users.repository.PostApi;
import com.cursomicro.users.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private PostApi postApi;

    @Override
    public UserDto findUserAndPosts(Long user_id) {

        List<PostDto> posts = postApi.findPostsByUserId(user_id);
        User user = userRepository.findById(user_id).orElse(null);
        UserDto userDto = new UserDto(user.getUser_id(), user.getName(), user.getLastName(),
                user.getCellPhone(),posts);
        return userDto;
    }
}
