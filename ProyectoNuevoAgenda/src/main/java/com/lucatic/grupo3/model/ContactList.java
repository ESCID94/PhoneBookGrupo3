package com.lucatic.grupo3.model;

import java.util.List;

public class ContactList {

	private List<Contacto> contactList;


	//Lo ponemos protected para mejorar el control de JAXB
	protected ContactList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactList(List<Contacto> contactList) {
		super();
		this.contactList = contactList;
	}

	 
	public List<Contacto> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contacto> contactList) {
		this.contactList = contactList;
	}

	@Override
	public String toString() {
		return "ContactList [contactList=" + contactList + "]";
	}

}
