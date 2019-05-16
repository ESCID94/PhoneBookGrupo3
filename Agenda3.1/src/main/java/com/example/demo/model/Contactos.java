package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contactos {
	@Id
	private long idcontactos;
	private long idpersona;
	private long idtelefono;
	private long iddireccion;
	private long idprovincia;

	public long getIdcontactos() {
		return idcontactos;
	}

	public void setIdcontactos(long idcontactos) {
		this.idcontactos = idcontactos;
	}

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	public long getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(long idtelefono) {
		this.idtelefono = idtelefono;
	}

	public long getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(long iddireccion) {
		this.iddireccion = iddireccion;
	}

	public long getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(long idprovincia) {
		this.idprovincia = idprovincia;
	}

}
