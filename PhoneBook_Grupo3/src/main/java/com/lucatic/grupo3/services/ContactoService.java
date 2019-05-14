package com.lucatic.grupo3.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.repository.ContactoRepository;

@Service
public class ContactoService {

	@Autowired
	private ContactoRepository repository;
	
	public List<Contacto> getContacts() {
		return repository.createContactoList();
	}
	
	public Contacto save(Contacto contacto) {
		// TODO Auto-generated method stub
		return this.repository.save(contacto);
	}		
	
	public Contacto getContactById(int id) {
		List<Contacto> contactList = new ArrayList<Contacto>();
		contactList = repository.createContactoList();

		for (Contacto contact : contactList) {
			if (contact.getId() == id)
				return contact;
		}

		return null;
	}

	public Optional<Contacto> update(Contacto contacto) {
		// TODO Auto-generated method stub
		return this.repository.update(contacto);
	
	}

	public Optional<Contacto> delete(Long id) {
		// TODO Auto-generated method stub
		return this.repository.delete(id);

	}

	public Collection<Contacto> findAll() {
		// TODO Auto-generated method stub
		
		return this.repository.findAll();
		
	}

	public Optional<Contacto> findById(Long id) {
		// TODO Auto-generated method stub
		return this.repository.findById(id);

	}



}
