package com.lucatic.grupo3.repository;

// METODOS
/**
 * findAll	Returns a Collection of all the Contactos in the Map
 * findById	Searches the Map for a Contacto with the specified ID. If found, the Contacto is returned.
 * save	    Assigns the Contacto an ID and saves the Contacto in the Map.
 * update	Replaces the Contacto in the Map if it exists.
 * delete	Deletes the Contacto in the Map if it exists.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.lucatic.grupo3.model.Contacto;

@Repository
public class ContactoRepository {

	Map<Long, Contacto> Contactos = new HashMap<>();

	/*
	 * Typically, the database will assign the unique id (or primary key) when
	 * adding an entity. Since we are using an in-memory Map, we must explicitly
	 * assign the Contacto id in the repository class. Allowing the client to
	 * assign the unique id is not RESTful.
	 */
	long currentId = 100;

	// Return all Contactos
	public Collection<Contacto> findAll() {
		return Contactos.values();
	}

	// Find the Contacto with this id
	/*
	 * We are using java.util.Optional as a container for our Contacto object as
	 * it will help us handle cases where Contacto is null. This is purely an
	 * implementation decision and has nothing to do with REST concepts or
	 * constraints.
	 */
	public Optional<Contacto> findById(Long id) {
		Contacto Contacto = null;
		

		if (Contactos.containsKey(id)) {
			Contacto = Contactos.get(id);
		}
		return Optional.ofNullable(Contacto);
	}

	// Save a new Contacto
	public Contacto save(Contacto Contacto) {
		Contacto.setId(++currentId);
		Contactos.put(Contacto.getId(), Contacto);
		return Contacto;
	}

	// Update the Contacto with this id
	public Optional<Contacto> update(Contacto Contacto) {
		Contacto currentContacto = Contactos.get(Contacto.getId());

		if (currentContacto != null) {
			Contactos.put(Contacto.getId(), Contacto);
			currentContacto = Contactos.get(Contacto.getId());
		}
		return Optional.ofNullable(currentContacto);
	}

	// Delete Contacto with this id
	public Optional<Contacto> delete(Long id) {
		Contacto currentContacto = Contactos.get(id);

		if (currentContacto != null) {
			Contactos.remove(id);
		}
		return Optional.ofNullable(currentContacto);
	}

	public List<Contacto> createContactoList() {
		// TODO Auto-generated method stub
		return null;
	}
}
