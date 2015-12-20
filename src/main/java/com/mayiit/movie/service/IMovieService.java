package com.mayiit.movie.service;

import com.mayiit.movie.model.Movie;

import java.util.List;
import java.util.Map;


public interface IMovieService {
	
	public boolean doCreate(Movie movie);
	
	public List<Movie> findAll(Map<String, Object> map);
	
	public Movie findMovieDetailById(int var1);
	
	public int findCount(Map map);
	
	public boolean doDelete(int id);
	
	public boolean doUpdate(Movie movie);
	
	public List<Movie> findAllMovieAndTVForIndex(Map<String, Object> map);
	
	public List<Movie> findAllMovieForIndex(Map<String, Object> map);
	
	public List<Movie> findAllTVForIndex(Map<String, Object> map);
}
