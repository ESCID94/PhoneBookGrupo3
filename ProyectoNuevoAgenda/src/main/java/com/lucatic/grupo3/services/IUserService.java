package com.lucatic.grupo3.services;

import java.util.List;

import com.lucatic.grupo3.model.User;

public interface IUserService {
	public List<User> list();
	
	public User get(int id);
	
	public void update(User user);
	
	public void add(User user);
	
	public void delete(int id);

}
