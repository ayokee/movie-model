package com.mayiit.movie.model;

import java.io.Serializable;

public class MovieDownload implements Serializable{
	
	private int id;
	private int movieId;
	private String url;
	private String subtitle;
	private String audioChannel;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getAudioChannel() {
		return audioChannel;
	}
	public void setAudioChannel(String audioChannel) {
		this.audioChannel = audioChannel;
	}
	
	
	
}
