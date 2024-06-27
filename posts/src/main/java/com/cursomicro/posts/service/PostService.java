package com.cursomicro.posts.service;

import com.cursomicro.posts.entity.Post;

import java.util.List;

public interface PostService {

    List<Post> findPostsByUser(Long user_id);
}
