package com.cursomicro.posts.repository;

import com.cursomicro.posts.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p WHERE p.user_id = :user_id")
    List<Post> findPostsByUser(@Param("user_id") Long user_id);
}
