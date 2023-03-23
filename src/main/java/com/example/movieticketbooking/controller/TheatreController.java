package com.example.movieticketbooking.controller;


import com.example.movieticketbooking.model.Theatre;
import com.example.movieticketbooking.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TheatreController {
    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    @GetMapping("/theatres")
    public List<Theatre> getAllTheatres() {
        return theatreService.getAllTheatres();
    }
}
