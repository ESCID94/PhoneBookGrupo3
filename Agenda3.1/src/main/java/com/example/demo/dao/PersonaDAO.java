package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public class PersonaDAO implements IPersonaDAO {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> list() {
		String hql = "FROM Persona ORDER BY PERSONA_ID";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void add(Persona persona) {
		System.out.println(persona);
		entityManager.merge(persona);
		System.out.println("conseguido");
	}

}