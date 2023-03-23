package com.example.movieticketbooking.service;

import com.example.movieticketbooking.model.Screening;
import com.example.movieticketbooking.model.Seat;

import java.time.LocalDate;
import java.util.List;

public interface ScreeningService {
    List<Screening> getAllScreenings();

    Screening getScreeningById(Long screening_id);

    Screening pushScreening(Screening newScreening);

    Screening updateScreening(Screening updatedScreening, Long screening_id);

    List<Seat> getSeatsByScreeningId(Long screening_id);

    List<Screening> getAllScreenings(LocalDate startDate, LocalDate endDate);
}
