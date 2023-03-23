package com.example.movieticketbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MovieticketbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieticketbookingApplication.class, args);
	}

}
