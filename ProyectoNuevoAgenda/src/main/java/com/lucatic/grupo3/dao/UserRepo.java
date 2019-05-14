package com.lucatic.grupo3.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lucatic.grupo3.model.User;
@Repository
public class UserRepo implements IRepository<Object> {

	@PersistenceContext
	private EntityManager entityManager;
	
	public UserRepo() {}

	@Override
	public User getEntity(int id) {
		return entityManager.find(User.class, id) ;
	}

	@Override
	public void add(Object t) {
		// TODO Auto-generated method stub
		entityManager.merge((User) t);
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getEntity(id));
		
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		 User usuario = getEntity(((User) t).getId());
			
			usuario.setUsername(((User) t).getUsername());
			usuario.setEmail(((User) t).getEmail());
			usuario.setPassword(usuario.getPassword());
			
			entityManager.flush();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> list() {
		String hql = "FROM User ORDER BY USER_ID";
		return entityManager.createQuery(hql).getResultList();
	}

}
