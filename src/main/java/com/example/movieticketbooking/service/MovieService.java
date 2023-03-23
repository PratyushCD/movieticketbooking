package com.example.movieticketbooking.service;

import com.example.movieticketbooking.model.Movie;
import com.example.movieticketbooking.model.Screening;

import java.time.LocalDate;
import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();

    Movie getMovieById(Long movie_id);

    Movie pushMovie(Movie newMovie);

    Movie updateMovie(Movie updatedMovie, Long movie_id);

    void deleteMovie(Long movie_id);

    List<Screening> getAllScreeningByMovieId(Long movie_id);

    List<Screening> getAllScreeningByMovieIdAndDate(Long movie_id, LocalDate localDate);
}