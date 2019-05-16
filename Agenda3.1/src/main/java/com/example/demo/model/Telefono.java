package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefono {
	@Id
	private long idtelefono;
	private String telefono;
	private long idpersona;

	public Telefono() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Telefono(long idtelefono, String telefono, long idpersona) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
		this.idpersona = idpersona;
	}

	public long getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(long idtelefono) {
		this.idtelefono = idtelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	@Override
	public String toString() {
		return "Telefono [idtelefono=" + idtelefono + ", telefono=" + telefono + ", idpersona=" + idpersona + "]";
	}

}
