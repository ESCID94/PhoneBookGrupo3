package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public interface IPersonaDAO {
	
	public List<Persona> list();
	public Persona get (int id);
	public void update(Persona persona);
	public void add(Persona persona);
	public void delete(int id);
	public String personaDetails(int id);

}
