package com.mayiit.movie.dao;

import java.util.List;
import java.util.Map;

public interface IBaseDAO<T, K> {

	public boolean doCreate(T vo) throws Exception;

	public boolean doUpdate(T vo) throws Exception;

	public boolean doDelete(K id) throws Exception;

	public T findById(K id) throws Exception;

	public List<T> findAll(Map<String, Object> map) throws Exception;
	
	public int findCount(Map t)throws Exception;

}
