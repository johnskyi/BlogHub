package com.example.BlogHub.model.repository;

import com.example.BlogHub.model.entity.Post;
import com.example.BlogHub.model.entity.PostVote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
