package com.example.demo.services;

import java.util.List;

import com.example.demo.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUserService.
 */
public interface IUserService {
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<User> list();
	
	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the user
	 */
	public User get(int id);
	
	/**
	 * Update.
	 *
	 * @param user the user
	 */
	public void update(User user);
	
	/**
	 * Adds the.
	 *
	 * @param user the user
	 */
	public void add(User user);
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(int id);

}
