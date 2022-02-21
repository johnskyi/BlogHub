package com.example.BlogHub.model.repository;

import com.example.BlogHub.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
