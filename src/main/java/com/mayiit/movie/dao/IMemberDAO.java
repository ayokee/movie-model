package com.mayiit.movie.dao;

import com.mayiit.movie.model.Member;

public interface IMemberDAO extends IBaseDAO<Member, Integer>{
	
	public String findNameById(int mid)throws Exception;
}
