package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
@Service
public interface IPersonaServicios {
	public List<Persona> list();
	
	public Persona get(int id);
	public void add(Persona persona);
	public void update(Persona persona);	
	public void delete(int id);
	public String personaDetails(int id);
}
