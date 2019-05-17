package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;
@Service
public class PersonaServicios implements IPersonaServicios {
	@Autowired
	PersonaDAO personaDao = new PersonaDAO();
	@Override
	public List<Persona> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return personaDao.get(id);
	}

	@Override
	public void add(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.update(persona);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		personaDao.delete(id);
	}

	@Override
	public void personaDetails(int id) {
		// TODO Auto-generated method stub
		
		personaDao.personaDetails(id);
	}

}
