package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {

	public List<Persona> list();
	
	public void add(Persona persona);
	public void delete(int id);

	public Persona get(int idpersona);
}
