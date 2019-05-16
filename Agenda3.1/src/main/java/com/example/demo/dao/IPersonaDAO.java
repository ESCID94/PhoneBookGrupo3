package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public interface IPersonaDAO {
	public List<Persona> list();

	public void add(Persona persona);

}
