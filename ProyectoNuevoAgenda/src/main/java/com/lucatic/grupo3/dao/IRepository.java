package com.lucatic.grupo3.dao;

import org.springframework.stereotype.Repository;
@Repository
public interface IRepository<T> {
		
	public T getEntity(int id);
	
	public void update(T t);
	public void add(T t);
	
	public void delete(int id);

}
