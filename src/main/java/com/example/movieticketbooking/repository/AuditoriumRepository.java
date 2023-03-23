package com.example.movieticketbooking.repository;


import com.example.movieticketbooking.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long> {
}
