package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public class PersonaDAO implements IPersonaDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	public PersonaDAO() {}

	public Persona getPersonaById(int id) {
		return entityManager.find(Persona.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> list() {
		String hql = "FROM Persona ORDER BY PERSONA_ID";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	@Transactional
	public void add(Persona persona) {
		entityManager.merge(persona);
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getPersonaById(id));
	}
	

}