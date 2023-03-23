package com.example.movieticketbooking.handler;

import com.example.movieticketbooking.controller.ScreeningController;
import com.example.movieticketbooking.exception.HousefullException;
import com.example.movieticketbooking.model.ErrorDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@Slf4j
@RestControllerAdvice(assignableTypes = ScreeningController.class)
public class ScreeningExceptionHandler {

    @ExceptionHandler(HousefullException.class)
    public ResponseEntity<?> handleHouseFullException(HousefullException ex, WebRequest request) {

        log.debug("In Screening Exception Handler");


        ErrorDetail error = new ErrorDetail(new Date(), "House Full!", ex.toString());

        return new ResponseEntity<>(
                error, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }
}
