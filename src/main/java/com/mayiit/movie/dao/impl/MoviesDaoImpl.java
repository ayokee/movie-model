package com.mayiit.movie.dao.impl;

import com.mayiit.movie.dao.IMoviesDAO;
import com.mayiit.movie.model.Movie;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MoviesDaoImpl implements IMoviesDAO {

	@Autowired SqlSessionTemplate sqlSessionTemplate;
	
	public boolean doCreate(Movie vo) throws Exception {
		return false;
	}

	public boolean doUpdate(Movie vo) throws Exception {
		return false;
	}

	public boolean doDelete(Integer id) throws Exception {
		return false;
	}

	public Movie findMovieDetailById(int id) throws Exception {
		Movie movie = sqlSessionTemplate.selectOne("findMovieDetailById",id);
		return movie;
	}

	public List<Movie> findAll(Map<String,Object> map) throws Exception {
		return null;
	}

	public int findCount(Map t) throws Exception {
		return 0;
		
	}

	public List<Movie> findAllMovieAndTVForIndex(Map<String, Object> map) {
		return null;
	}

	public List<Movie> findAllMovieForIndex(Map<String, Object> map) {
		List<Movie> l = sqlSessionTemplate.selectList("findAllMovieForIndex", map);
		return l;
	}

	public List<Movie> findAllTVForIndex(Map<String, Object> map) {
		List<Movie> l = sqlSessionTemplate.selectList("findAllTVForIndex", map);
		return l;
	}

	public Movie findById(Integer id) throws Exception {
		return null;
	}

}
