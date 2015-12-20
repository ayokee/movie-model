package com.mayiit.movie.service.impl;

import com.mayiit.movie.dao.IMoviesDAO;
import com.mayiit.movie.model.Movie;
import com.mayiit.movie.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private IMoviesDAO iMoviesDAO;
	
	public boolean doCreate(Movie movie) {
		return false;
	}

	public List<Movie> findAll(Map<String,Object> map) {
		List<Movie> list = null;
		try {
			list = iMoviesDAO.findAll(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Movie findMovieDetailById(int var1) {
		Movie movie =null;
		try {
			movie = iMoviesDAO.findMovieDetailById(var1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return movie;
	}

	public int findCount(Map map) {
		int count =0;
		try {
			count = iMoviesDAO.findCount(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}

	public boolean doDelete(int id) {
		boolean msg = false;
		try {
			msg = iMoviesDAO.doDelete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	public boolean doUpdate(Movie movie) {
		boolean msg = false;
		try {
			msg = iMoviesDAO.doUpdate(movie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	public List<Movie> findAllMovieAndTVForIndex(Map<String, Object> map) {
		List<Movie> list = null;
		try {
			list = iMoviesDAO.findAllMovieAndTVForIndex(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Movie> findAllMovieForIndex(Map<String, Object> map) {
		List<Movie> list = null;
		try {
			list = iMoviesDAO.findAllMovieForIndex(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Movie> findAllTVForIndex(Map<String, Object> map) {
		List<Movie> list = null;
		try {
			list = iMoviesDAO.findAllTVForIndex(map);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
