package com.lucatic.grupo3.services;


import org.springframework.stereotype.Service;


@Service
public interface IService<T>  {
		
	public T getEntity(int id);
	
	public void update(T t);
	public void add(T t);
	
	public void delete(int id);

}
