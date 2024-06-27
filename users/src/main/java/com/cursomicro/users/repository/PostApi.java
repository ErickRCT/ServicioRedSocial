package com.cursomicro.users.repository;

import com.cursomicro.users.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "posts")
public interface PostApi {

    @GetMapping("/posts/obtener/{user_id}")
    List<PostDto> findPostsByUserId(@PathVariable("user_id") Long userId);
}
