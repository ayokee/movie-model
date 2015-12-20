package com.mayiit.movie.model;

import java.io.Serializable;

public class Rating implements Serializable{

	
	private int id;
	private int movieId;
	private int doubanId;
	private float imdb;			//imdb评分
	private float douban;		//豆瓣评分
	private int stars;			//评星数
	private int commentsCount;	//评论人数
	
	
	
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
	public float getImdb() {
		return imdb;
	}
	public void setImdb(float imdb) {
		this.imdb = imdb;
	}
	public float getDouban() {
		return douban;
	}
	public void setDouban(float douban) {
		this.douban = douban;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public int getCommentsCount() {
		return commentsCount;
	}
	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}
	
	
	
}
