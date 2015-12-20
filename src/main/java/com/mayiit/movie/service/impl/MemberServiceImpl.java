package com.mayiit.movie.service.impl;

import com.mayiit.movie.dao.IMemberDAO;
import com.mayiit.movie.model.Member;
import com.mayiit.movie.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private IMemberDAO iMemberDAO;

	public boolean doCreate(Member member) {
		return false;
	}

	public List<Member> findAll(Map<String, Object> map) {
		List<Member> list = null;
		try {
			list = iMemberDAO.findAll(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Member findById(int var1) {
		return null;
	}

	public int findCount(Map map) {
		int count = 0;
		try {
			count = iMemberDAO.findCount(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public boolean doDelete(int id) {
		return false;
	}

	public boolean doUpdate(Member member) {
		boolean msg = false;
		try {
			msg = iMemberDAO.doUpdate(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	public String findNameById(int mid) {
		String name = "";
		try {
			name = iMemberDAO.findNameById(mid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return name;
	}

}
