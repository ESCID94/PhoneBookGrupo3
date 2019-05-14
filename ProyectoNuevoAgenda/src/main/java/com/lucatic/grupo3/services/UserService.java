package com.lucatic.grupo3.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucatic.grupo3.dao.UserRepo;
import com.lucatic.grupo3.model.User;
@Service
@Transactional
public class UserService implements IService<Object> {

	@Autowired
	private UserRepo data;
	
	
	public List<User> list() {
		return data.list();
	}

	@Override
	public User get(int id) {
		return data.get(id);
	}

	@Override
	public void delete(int id) {
		data.delete(id);
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		data.update(t);
	}

	@Override
	public void add(Object t) {
		// TODO Auto-generated method stub
		data.add(t);
	}

}
