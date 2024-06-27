package com.cursomicro.posts.controller;

import com.cursomicro.posts.entity.Post;
import com.cursomicro.posts.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")

public class PostController {

    @Autowired
    private PostService postService;

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/obtener/{user_id}")
    public List<Post> obtenerPost(@PathVariable("user_id") Long user_id) {
        System.out.println("------------- estoy en el puerto : " + serverPort);
        return postService.findPostsByUser(user_id);
    }
}
