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

	public Telefono() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefono(String telefono) {
		// TODO Auto-generated constructor stub
		this.telefono = telefono;
		
	}

	public Telefono(long idtelefono, String telefono, long idpersona) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
		this.idpersona = idpersona;
	}	
	
}
