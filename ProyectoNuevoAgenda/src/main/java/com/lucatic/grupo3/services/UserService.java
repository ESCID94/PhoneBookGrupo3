package com.lucatic.grupo3.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatic.grupo3.dao.IUserDAO;
import com.lucatic.grupo3.model.User;


@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private IUserDAO iuserDAO;
	
	
	
	@Override
	public List<User> list() {
		return iuserDAO.list();
	}

	@Override
	public User get(int id) {
		return iuserDAO.get(id);
	}

	@Override
	public void update(User user) {
		iuserDAO.update(user);
	}

	@Override
	public void add(User user) {
		iuserDAO.add(user);
	}

	@Override
	public void delete(int id) {
		iuserDAO.delete(id);
	}

}