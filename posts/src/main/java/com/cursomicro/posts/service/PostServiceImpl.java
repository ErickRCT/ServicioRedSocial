package com.cursomicro.posts.service;

import com.cursomicro.posts.entity.Post;
import com.cursomicro.posts.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Override
    public List<Post> findPostsByUser(Long user_id) {
        return postRepository.findPostsByUser(user_id);
    }
}
