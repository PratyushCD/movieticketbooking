package com.example.movieticketbooking.repository;

import com.example.movieticketbooking.model.SeatBooked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
