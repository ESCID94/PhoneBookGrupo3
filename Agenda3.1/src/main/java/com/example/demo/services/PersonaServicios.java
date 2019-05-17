package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.model.Persona;

@Service
public class PersonaServicios implements IPersonaServicios{
	
	@Autowired
	private IPersonaDAO personaDAO;

	@Override
	public List<Persona> list() {
		return personaDAO.list();
	}

	@Override
	public Persona get(int id) {
		return personaDAO.get(id);
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
