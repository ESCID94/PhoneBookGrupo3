package com.lucatic.grupo3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepo implements IRepository<Object>{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Object getEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Object t) {
		// TODO Auto-generated method stub
		entityManager.merge(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		entityManager.remove(getEntity(id));
	}
	
}
