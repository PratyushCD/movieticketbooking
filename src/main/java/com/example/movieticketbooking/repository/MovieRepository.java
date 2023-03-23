package com.example.movieticketbooking.repository;


import com.example.movieticketbooking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
