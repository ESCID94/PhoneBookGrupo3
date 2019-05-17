package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaServicios {
	
	public List<Persona> list();
	
	public Persona get(int id);
	
	public void update(Persona persona);
	
	public void add(Persona persona);
	
	public void delete(int id);
	
}
