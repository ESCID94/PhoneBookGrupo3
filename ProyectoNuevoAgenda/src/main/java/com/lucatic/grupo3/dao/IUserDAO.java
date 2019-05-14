package com.lucatic.grupo3.dao;

import java.util.List;

import com.lucatic.grupo3.model.User;

public interface IUserDAO {
	public List<User> list();
	
	public User get(int id);
	
	public void update(User user);
	public void add(User user);
	
	public void delete(int id);

}
