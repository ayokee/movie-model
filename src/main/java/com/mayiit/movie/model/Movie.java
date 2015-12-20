package com.mayiit.movie.model;

import java.io.Serializable;
import java.util.Date;

public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String title;				//电影名
	private String originalTitle;  		//原名
	private String aka;					//又名
	private String images;				//电影海报图，分别提供288px x 465px(大)，96px x 155px(中) 64px x 103px(小)尺寸
	private int subtype;				//条目分类, movie或者tv  0电影，1电视剧
	private String directors;			//导演，数据结构为影人的简化描述，见附录
	private String casts;				//主演，最多可获得4个，数据结构为影人的简化描述，见附录
	private String writers;				//编剧，数据结构为影人的简化描述，见附录
	private Date pubdates;				//如果条目类型是电影则为上映日期，如果是电视剧则为首映日期
	private Date years;					//年代
	private String languages;			//语言
	private String durations;			//片长
	private String genres;				//影片类型，最多提供3个
	private String countries;			//制片国家/地区
	private String summary;				//简介
	private int seasonsCount;			//总季数 (tv only)
	private int currentSeason;			//当前季数(tv only)
	private int episodesCount;			//当前季的集数(tv only)
	private String photos;				//电影剧照，前10张，见附录
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getAka() {
		return aka;
	}
	public void setAka(String aka) {
		this.aka = aka;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getSubtype() {
		return subtype;
	}
	public void setSubtype(int subtype) {
		this.subtype = subtype;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public String getCasts() {
		return casts;
	}
	public void setCasts(String casts) {
		this.casts = casts;
	}
	public String getWriters() {
		return writers;
	}
	public void setWriters(String writers) {
		this.writers = writers;
	}
	public Date getPubdates() {
		return pubdates;
	}
	public void setPubdates(Date pubdates) {
		this.pubdates = pubdates;
	}
	public Date getYears() {
		return years;
	}
	public void setYears(Date years) {
		this.years = years;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public String getDurations() {
		return durations;
	}
	public void setDurations(String durations) {
		this.durations = durations;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getSeasonsCount() {
		return seasonsCount;
	}
	public void setSeasonsCount(int seasonsCount) {
		this.seasonsCount = seasonsCount;
	}
	public int getCurrentSeason() {
		return currentSeason;
	}
	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
	}
	public int getEpisodesCount() {
		return episodesCount;
	}
	public void setEpisodesCount(int episodesCount) {
		this.episodesCount = episodesCount;
	}
	public String getPhotos() {
		return photos;
	}
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	


}
