package com.example.movieticketbooking.repository;

import com.example.movieticketbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
