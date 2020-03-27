package com.sharifi.practice.movieinfoservice.resources;

import com.sharifi.practice.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movies")
public class MovieResource {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie(movieId,"inception");
    }
}
