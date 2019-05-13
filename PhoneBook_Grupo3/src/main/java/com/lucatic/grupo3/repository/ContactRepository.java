package com.lucatic.grupo3.repository;

// METODOS
/**
 * findAll	Returns a Collection of all the contacts in the Map
 * findById	Searches the Map for a contact with the specified ID. If found, the contact is returned.
 * save	    Assigns the contact an ID and saves the contact in the Map.
 * update	Replaces the contact in the Map if it exists.
 * delete	Deletes the contact in the Map if it exists.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.lucatic.grupo3.model.Contacto;

@Repository
public class ContactRepository {

	Map<Long, Contacto> contacts = new HashMap<>();

	/*
	 * Typically, the database will assign the unique id (or primary key) when
	 * adding an entity. Since we are using an in-memory Map, we must explicitly
	 * assign the contact id in the repository class. Allowing the client to
	 * assign the unique id is not RESTful.
	 */
	long currentId = 100;

	// Return all contacts
	public Collection<Contacto> findAll() {
		return contacts.values();
	}

	// Find the contact with this id
	/*
	 * We are using java.util.Optional as a container for our contact object as
	 * it will help us handle cases where contact is null. This is purely an
	 * implementation decision and has nothing to do with REST concepts or
	 * constraints.
	 */
	public Optional<Contacto> findById(Long id) {
		Contacto contact = null;
		

		if (contacts.containsKey(id)) {
			contact = contacts.get(id);
		}
		return Optional.ofNullable(contact);
	}

	// Save a new contact
	public Contacto save(Contacto contact) {
		contact.setId(++currentId);
		contacts.put(contact.getId(), contact);
		return contact;
	}

	// Update the contact with this id
	public Optional<Contacto> update(Contacto contact) {
		Contacto currentContact = contacts.get(contact.getId());

		if (currentContact != null) {
			contacts.put(contact.getId(), contact);
			currentContact = contacts.get(contact.getId());
		}
		return Optional.ofNullable(currentContact);
	}

	// Delete contact with this id
	public Optional<Contacto> delete(Long id) {
		Contacto currentContact = contacts.get(id);

		if (currentContact != null) {
			contacts.remove(id);
		}
		return Optional.ofNullable(currentContact);
	}

	public List<Contacto> createContactList() {
		// TODO Auto-generated method stub
		return null;
	}
}
