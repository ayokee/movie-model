package com.mayiit.movie.model;

import java.io.Serializable;

public class MovieCheck implements Serializable{
	
	
	private int id;
	private int movieId;
	private int doubanId;
	private int imdbId;
	private int tuId;
	private int dytt8Id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getDoubanId() {
		return doubanId;
	}
	public void setDoubanId(int doubanId) {
		this.doubanId = doubanId;
	}
	public int getImdbId() {
		return imdbId;
	}
	public void setImdbId(int imdbId) {
		this.imdbId = imdbId;
	}
	public int getTuId() {
		return tuId;
	}
	public void setTuId(int tuId) {
		this.tuId = tuId;
	}
	public int getDytt8Id() {
		return dytt8Id;
	}
	public void setDytt8Id(int dytt8Id) {
		this.dytt8Id = dytt8Id;
	}
	
	
}
