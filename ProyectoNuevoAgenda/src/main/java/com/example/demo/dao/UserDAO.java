package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
@Repository
public class UserDAO implements IUserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public UserDAO() {}

	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<User> list() {
		String hql = "FROM User ORDER BY USER_ID";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public User get(int id) {
		return entityManager.find(User.class, id) ;
	}
	@Override
	public void update(User user) {
        User usuario = getUserById(user.getId());
		
		usuario.setUsername(user.getUsername());
		usuario.setEmail(user.getEmail());
		usuario.setPassword(usuario.getPassword());
		
		entityManager.flush();
		
	}

	@Override
	public void add(User user) {
		entityManager.merge(user);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getUserById(id));
		
	}

}
