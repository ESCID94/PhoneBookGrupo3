package com.lucatic.grupo3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lucatic.grupo3.model.Contact;
import com.lucatic.grupo3.repository.ContactRepository;

@Repository
public class ContactService {

	@Autowired
	private ContactRepository data;
	
	public List<Contact> getContacts() {
		return data.createContactList();
	}
	
	
	
	public Contact getContactById(int id) {
		List<Contact> contactList = new ArrayList<Contact>();
		contactList = data.createContactList();

		for (Contact contact : contactList) {
			if (contact.getId() == id)
				return contact;
		}

		return null;
	}		

}
