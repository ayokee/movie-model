package com.mayiit.movie.service.impl;

import com.mayiit.movie.dao.IAdminsDAO;
import com.mayiit.movie.model.Admin;
import com.mayiit.movie.service.IAdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class AdminsServiceImpl implements IAdminsService {
	
    @Autowired
    private IAdminsDAO iAdminsDAO;

	public Admin login_admin(Map map) {
		Admin admin = null;
		try {
			admin = iAdminsDAO.login_admin(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admin;
	}

	public boolean doUpLast(String userName, Date lastTime) {
		boolean msg = false;
		try {
			msg = iAdminsDAO.doUpLast( userName,  lastTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return msg;
	}

	public boolean doCreate(Admin admin) {
		boolean msg = false;
		try {
			msg = iAdminsDAO.doCreate( admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return msg;
	}

	public List<Admin> findAll(Map<String,Object> map) {
		List<Admin> list = new ArrayList<Admin>();
		
		try {
			list = iAdminsDAO.findAll( map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	public Admin findById(int var1) {
		Admin admin = null;
		try {
			admin = iAdminsDAO.findById(var1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return admin;
	}

	public int findCount(Map map) {
		int count = 0;
		try {
			count = iAdminsDAO.findCount(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
