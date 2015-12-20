package com.mayiit.movie.service;

import com.mayiit.movie.model.Member;

import java.util.List;
import java.util.Map;


public interface IMemberService {
	
	public boolean doCreate(Member member);
	
	public List<Member> findAll(Map<String, Object> map);
	
	public Member findById(int var1);
	
	public int findCount(Map map);
	
	public boolean doDelete(int id);
	
	public boolean doUpdate(Member member);
	
	public String findNameById(int mid);

}
