package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.model.Persona;
@Service
@Transactional
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDAO ipersonaDAO;
	
	@Override
	public List<Persona> list() {
		return ipersonaDAO.list();
		}
	@Override
	public void add(Persona persona) {
		ipersonaDAO.add(persona);
	}

	@Override
	public void delete(int id) {
		ipersonaDAO.delete(id);
		
	}

}
