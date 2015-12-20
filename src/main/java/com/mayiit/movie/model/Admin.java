package com.mayiit.movie.model;

import java.io.Serializable;

public class Admin implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String emailId;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
