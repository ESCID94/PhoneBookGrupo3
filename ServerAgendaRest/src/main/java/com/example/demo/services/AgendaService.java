/*
 * 
 */
package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AgendaRepository;
import com.example.demo.model.Persona;


// TODO: Auto-generated Javadoc
/**
 * The Class Services.
 * @param <T>
 *
 * @param <T> the generic type
 * @param <ID> the generic type
 * @param <T>
 */

@Service
@Transactional
public class AgendaService {

	/** The repo. */
	
	@Autowired
	AgendaRepository repo;
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<Persona> list(){
		return repo.findAll();}
	
	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the t
	 */
	public Persona get (int id) {
		return repo.findById(id).orElse(null);}
	
	/**
	 * Adds the.
	 * @param <T>
	 *
	 * @param t the t
	 * @return 
	 */
	public Persona add(Persona p) {
		return repo.save(p);
	}
	
	/**
	 * Update.
	 *
	 * @param t the t
	 */
	public Persona update(Persona p) {
		return repo.saveAndFlush(p);
	}
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	/**
	 * Details.
	 *
	 * @param id the id
	 * @return the string
	 */
	public String details(int id) {
		return get(id).toString();
	}
	
}
