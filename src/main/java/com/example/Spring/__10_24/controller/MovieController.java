package com.example.Spring.__10_24.controller;

import com.example.Spring.__10_24.entity.Movie; // Update this line
import com.example.Spring.__10_24.service.MovieService;

import org.springframework.web.bind.annotation.*;
// package com.example.movieapi.controller;

import com.example.Spring.__10_24.entity.Movie;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
// @RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React frontend
public class MovieController {

    @Autowired
    private MovieService movieService;

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    // POST request to add movies using the Movie entity
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        // Call the service to save the movie
        movieService.saveMovie(movie);
        return "Movie added successfully!";
    }
}