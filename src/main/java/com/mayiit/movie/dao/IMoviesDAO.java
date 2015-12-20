package com.mayiit.movie.dao;

import com.mayiit.movie.model.Movie;

import java.util.List;
import java.util.Map;

public interface IMoviesDAO extends IBaseDAO<Movie, Integer>{
	
	public List<Movie> findAllMovieAndTVForIndex(Map<String, Object> map);
	
	public List<Movie> findAllMovieForIndex(Map<String, Object> map);
	
	public List<Movie> findAllTVForIndex(Map<String, Object> map);

	public Movie findMovieDetailById(int id)throws Exception ;
}
