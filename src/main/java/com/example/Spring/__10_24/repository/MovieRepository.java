package com.example.Spring.__10_24.repository;


// import com.example.movieapi.entity.Movie;
import com.example.Spring.__10_24.entity.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}