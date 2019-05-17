package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sound.midi.Soundbank;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;
import com.example.demo.model.User;

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
	@Transactional
	public void add(Persona persona) {
		entityManager.merge(persona);
	}

	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		System.out.println(entityManager.find(Persona.class,id).toString());
		
		return entityManager.find(Persona.class, id);
		
	}

	@Override
	@Transactional
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		Persona person = get(persona.getIdpersona());
		
		person.setNombre(persona.getNombre());
		person.setApellido1(persona.getApellido1());
		person.setApellido2(persona.getApellido2());
		person.setDireccions((persona.getDireccions()));
		person.setDni(persona.getDni());
		person.setFechanacimiento(persona.getFechanacimiento());
		person.setTelefonos(persona.getTelefonos());
	
		entityManager.flush();
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Persona person = this.get(id);
		
		entityManager.remove(person);
	}

	@Override
	@Transactional
	public String personaDetails(int id) {
		// TODO Auto-generated method stub
		Persona person = this.get(id);
		
		return person.toString();
	}

}