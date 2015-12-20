package com.mayiit.movie.model;

import java.io.Serializable;

public class MovieFeature implements Serializable{

	private int id;
	private int movieId;
	private int subscriptions;   		//订阅数
	private int concern;				//用户喜欢数
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
	public int getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(int subscriptions) {
		this.subscriptions = subscriptions;
	}
	public int getConcern() {
		return concern;
	}
	public void setConcern(int concern) {
		this.concern = concern;
	}
	
	
	
}
