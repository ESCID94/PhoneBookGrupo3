package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
// TODO: Auto-generated Javadoc

/**
 * The Interface IPersonaServicios.
 */
@Service
public interface IPersonaServicios {
	
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
	
	/**
	 * Update.
	 *
	 * @param persona the persona
	 */
	public void update(Persona persona);	
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(int id);
	
	/**
	 * Persona details.
	 *
	 * @param id the id
	 * @return the string
	 */
	public void personaDetails(int id);
}
