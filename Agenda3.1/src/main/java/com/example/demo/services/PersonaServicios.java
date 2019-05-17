package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;
// TODO: Auto-generated Javadoc

/**
 * The Class PersonaServicios.
 */
@Service
public class PersonaServicios implements IPersonaServicios {
	
	/** The persona dao. */
	@Autowired
	PersonaDAO personaDao = new PersonaDAO();
	
	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#list()
	 */
	@Override
	public List<Persona> list() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#get(int)
	 */
	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return personaDao.get(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#add(com.example.demo.model.Persona)
	 */
	@Override
	public void add(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#update(com.example.demo.model.Persona)
	 */
	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.update(persona);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#delete(int)
	 */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#personaDetails(int)
	 */
	@Override
	public String personaDetails(int id) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
