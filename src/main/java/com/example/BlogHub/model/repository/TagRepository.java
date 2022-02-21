package com.example.BlogHub.model.repository;

import com.example.BlogHub.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
