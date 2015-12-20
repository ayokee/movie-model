package com.mayiit.movie.service;

import com.mayiit.movie.model.Admin;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IAdminsService {
	
	public Admin login_admin(Map map);
	
	public boolean doUpLast(String userName, Date lastTime);
	
	public boolean doCreate(Admin admin);
	
	public List<Admin> findAll(Map<String, Object> map);
	
	public Admin findById(int var1);
	
	public int findCount(Map map);
	
}
