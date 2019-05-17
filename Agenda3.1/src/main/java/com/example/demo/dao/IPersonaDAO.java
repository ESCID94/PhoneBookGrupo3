package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;


// TODO: Auto-generated Javadoc
/**
 * The Interface IPersonaDAO.
 */
@Repository
public interface IPersonaDAO {
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<Persona> list();
		
	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the persona
	 */
	public Persona get(int id);
	
	/**
	 * Adds the.
	 *
	 * @param persona the persona
	 */
	public void add(Persona persona);
	public void delete(int id);

}
