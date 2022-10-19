package com.nestDigital.movieBackend.controller;

import com.nestDigital.movieBackend.dao.MovieDAO;
import com.nestDigital.movieBackend.model.MovieModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/movieAdd",consumes = "application/json",produces = "application/json")
    public String movie(@RequestBody MovieModel movie){
        dao.save(movie);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewMovies")
    public List<MovieModel> viewMovie(){
        return (List<MovieModel>)dao.findAll();
    }
}
