package com.example.movieticketbooking.exception;

public class AuditoriumNotFoundException extends RuntimeException {
    public AuditoriumNotFoundException(Long auditorium_id) {
    }
}
