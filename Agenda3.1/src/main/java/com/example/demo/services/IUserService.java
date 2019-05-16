package com.example.demo.services;

import java.util.List;

import com.example.demo.model.User;

public interface IUserService {
	public List<User> list();
	
	public User get(int id);
	
	public void update(User user);
	
	public void add(User user);
	
	public void delete(int id);

}
