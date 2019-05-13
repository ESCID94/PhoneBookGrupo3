package com.lucatic.grupo3.model;

import java.util.List;


public class ListaContactos {

	private List<Contacto> listaContactos;


	//Lo ponemos protected para mejorar el control de JAXB
	protected ListaContactos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListaContactos(List<Contacto> listaContactos) {
		super();
		this.listaContactos = listaContactos;
	}

	 
	public List<Contacto> getContactList() {
		return listaContactos;
	}

	public void setContactList(List<Contacto> listaContactos) {
		this.listaContactos = listaContactos;
	}
	
}
