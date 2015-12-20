package com.mayiit.movie.dao.impl;

import com.mayiit.movie.dao.IAdminsDAO;
import com.mayiit.movie.model.Admin;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("admindao")
public class AdminsDAOImpl implements IAdminsDAO {
	@Autowired SqlSessionTemplate sqlSessionTemplate;

	public boolean doCreate(Admin vo) throws Exception {
		int msg = 0;
		msg = sqlSessionTemplate.insert("doCreate",vo);
		sqlSessionTemplate.commit();
		return msg>0;
	}

	public boolean doUpdate(Admin vo) throws Exception {
		return false;
	}

	public boolean doDelete(Integer id) throws Exception {
		return false;
	}

	public Admin findById(Integer id) throws Exception {
		Admin admin = null;
		admin = sqlSessionTemplate.selectOne("findById",id);
		return admin;
	}

	public List<Admin> findAll(Map<String,Object> map) throws Exception {
		List<Admin> l = null;
		try {
			l = sqlSessionTemplate.selectList("findAll", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public Admin login_admin(Map map) {
		Admin admin = null;
		try {
			admin = sqlSessionTemplate.selectOne("selectUser",map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return admin;
	}

	public boolean doUpLast(String userName, Date lastTime) {
		int msg =0;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userName", userName);
		map.put("lastTime", lastTime);
		try {
			msg = sqlSessionTemplate.update("doUpLast", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg>0;
	}

	public int findCount(Map map) {
		int l = 0;
		try {
			l = sqlSessionTemplate.selectOne("findCount", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
}
