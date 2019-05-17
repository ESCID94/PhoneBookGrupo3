package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Persona;

@Repository
public class PersonaDAO implements IPersonaDAO {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Persona> list() {
		String hql = "FROM Persona ORDER BY idpersona";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void add(Persona persona) {
		System.out.println(persona);
		entityManager.merge(persona);
		System.out.println("conseguido");
	}
	
	@Override
	public Persona get (int id) {
		return entityManager.find(Persona.class, id);
		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String personaDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}