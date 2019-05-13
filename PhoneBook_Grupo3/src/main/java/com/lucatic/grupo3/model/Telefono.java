package com.lucatic.grupo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Telefono {
	@Id
	private long idtelefono;
	private String telefono;
	private long idpersona;

	public Telefono(String telefono) {
		// TODO Auto-generated constructor stub
		this.telefono = telefono;
		
	}
	
	public long getIdtelefono(int i) {
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



}
