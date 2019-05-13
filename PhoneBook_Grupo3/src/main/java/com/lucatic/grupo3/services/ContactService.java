package com.lucatic.grupo3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lucatic.grupo3.model.Contacto;

import com.lucatic.grupo3.repository.ContactoRepository;

@Repository
public class ContactService {

	@Autowired
	private ContactoRepository data;
	
	public List<Contacto> getContacts() {
		return data.createContactoList();
	}
	
	
	
	public Contacto getContactById(int id) {
		List<Contacto> contactList = new ArrayList<Contacto>();
		contactList = data.createContactoList();

		for (Contacto contact : contactList) {
			if (contact.getId() == id)
				return contact;
		}

		return null;
	}		

}
