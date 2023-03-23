package com.example.movieticketbooking.repository;

import com.example.movieticketbooking.model.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {}
