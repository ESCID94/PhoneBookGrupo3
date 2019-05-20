package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonaDAO;
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
	private IPersonaDAO ipersonaDao = new PersonaDAO();
	
	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#list()
	 */
	@Override
	public List<Persona> list() {
		// TODO Auto-generated method stub
		return ipersonaDao.list();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#get(int)
	 */
	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		return ipersonaDao.get(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#add(com.example.demo.model.Persona)
	 */
	@Override
	public void add(Persona persona) {
		ipersonaDao.add(persona);
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#update(com.example.demo.model.Persona)
	 */
	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		ipersonaDao.update(persona);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#delete(int)
	 */
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		ipersonaDao.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.services.IPersonaServicios#personaDetails(int)
	 */
	@Override
	public void personaDetails(int id) {
		// TODO Auto-generated method stub
		
		ipersonaDao.personaDetails(id);
	}

}
