package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUserDAO;
import com.example.demo.model.User;


// TODO: Auto-generated Javadoc
/**
 * The Class UserService.
 */
@Service
@Transactional
public class UserService implements IUserService {

	/** The iuser DAO. */
	@Autowired
	private IUserDAO iuserDAO;
	
	
	
	/* (non-Javadoc)
	 * @see com.example.demo.services.IUserService#list()
	 */
	@Override
	public List<User> list() {
		return iuserDAO.list();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IUserService#get(int)
	 */
	@Override
	public User get(int id) {
		return iuserDAO.get(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IUserService#update(com.example.demo.model.User)
	 */
	@Override
	public void update(User user) {
		iuserDAO.update(user);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IUserService#add(com.example.demo.model.User)
	 */
	@Override
	public void add(User user) {
		iuserDAO.add(user);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IUserService#delete(int)
	 */
	@Override
	public void delete(int id) {
		iuserDAO.delete(id);
	}

}
