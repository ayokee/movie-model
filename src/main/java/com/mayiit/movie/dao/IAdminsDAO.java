package com.mayiit.movie.dao;


import com.mayiit.movie.model.Admin;

import java.util.Date;
import java.util.Map;

public interface IAdminsDAO extends IBaseDAO<Admin, Integer>{
	
	public Admin login_admin(Map map);
	
	public boolean doUpLast(String userName, Date lastTime);
	
}
