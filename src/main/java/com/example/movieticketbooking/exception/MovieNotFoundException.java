package com.example.movieticketbooking.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long movie_id) {
    }
}
