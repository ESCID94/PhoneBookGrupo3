package com.lucatic.grupo3.model;

import java.util.List;

public class ContactList {

	private List<Contact> contactList;


	//Lo ponemos protected para mejorar el control de JAXB
	protected ContactList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactList(List<Contact> contactList) {
		super();
		this.contactList = contactList;
	}

	 
	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
	
}
