/*
 * 
 */
package com.example.demo.services;

import java.io.Serializable;
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
@SuppressWarnings("hiding")
@Service
@Transactional
public class AgendaService<Persona, ID extends Serializable> {

	
	
	/** The repo. */
	
	@Autowired
	AgendaRepository<Persona, ID> repo;
	
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
		return (Persona) repo.findOne(id);}
	
	/**
	 * Adds the.
	 * @param <T>
	 *
	 * @param t the t
	 * @return 
	 */
	public Persona add(Persona p) {
		return (Persona) repo.save(p);
	}
	
	/**
	 * Update.
	 *
	 * @param t the t
	 */
	public Persona update(Persona p) {
		return (Persona) repo.saveAndFlush(p);
	}
	
	/**
	 * Delete.
	 *
	 * @param id the id
	 */
	public void delete(int id) {
		repo.delete(id);
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
