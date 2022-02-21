package com.example.BlogHub.model.repository;

import com.example.BlogHub.model.entity.PostVote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostVoteRepository extends JpaRepository<PostVote, Long> {
}
