package com.lucatic.grupo3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.repository.ContactRepository;

@Repository
public class ContactService {

	@Autowired
	private ContactRepository data;
	
	public List<Contacto> getContacts() {
		return data.createContactList();
	}
	
	public Contacto getContactById(int id) {
		List<Contacto> contactList = new ArrayList<Contacto>();
		contactList = data.createContactList();

		for (Contacto contact : contactList) {
			if (contact.getId() == id)
				return contact;
		}

		return null;
	}		

}
