/*
 * 
 */
package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AgendaRepository;
import com.example.demo.model.Direccion;
import com.example.demo.model.Persona;
import com.example.demo.model.Telefono;



// TODO: Auto-generated Javadoc
/**
 * The Class Services.
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
	 *
	 * @param p the p
	 * @return the persona
	 */
	public Persona add(Persona p) {
		return repo.save(p);
	}
	
	/**
	 * Update.
	 *
	 * @param p the p
	 * @return the persona
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
		Persona p = get(id);		
		List<Telefono> telefonos = p.getTelefonos(); 
		List<Direccion> direcciones = p.getDireccions();
		List<Telefono> telefonosAux = new ArrayList<Telefono>();
		List<Direccion> direccionesAux = new ArrayList<Direccion>();
		
		for (Direccion direccion : direcciones) {
			direccion.setPersona(null);
			direccionesAux.add(direccion);
		}
		
		for (Telefono telefono : telefonos) {
			telefono.setPersona(null);
			telefonosAux.add(telefono);
		}
		p.setDireccions(direccionesAux);
		p.setTelefonos(telefonosAux);
		repo.saveAndFlush(p);
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
