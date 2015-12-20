package com.mayiit.movie.dao.impl;

import com.mayiit.movie.dao.IMemberDAO;
import com.mayiit.movie.model.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MemberDAOImpl implements IMemberDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	public boolean doCreate(Member vo) throws Exception {
		return false;
	}

	public boolean doUpdate(Member vo) throws Exception {
		int msg = 0;
		msg = sqlSessionTemplate.update("doUpdateMember", vo);
		return msg>0;
	}

	public boolean doDelete(Integer id) throws Exception {
		return false;
	}

	public Member findById(Integer id) throws Exception {
		return null;
	}

	public List<Member> findAll(Map<String, Object> map) throws Exception {
		List<Member> list = null;
		try {
			list = sqlSessionTemplate.selectList("findMemberAll",map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int findCount(Map map) throws Exception {
		int l=0;
		try {
			l = sqlSessionTemplate.selectOne("findMemberCount", map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}

	public String findNameById(int mid) throws Exception {
		String name ="";
		try {
			name = sqlSessionTemplate.selectOne("findNameById", mid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

}
