package com.nestDigital.movieBackend.dao;

import com.nestDigital.movieBackend.model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieDAO extends CrudRepository<MovieModel,Integer> {
}
