package com.lucatic.grupo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Direccion {
	@Id
	private long iddireccion;
	private String direccion;
	private String codpostal;
	private String localidad;
	private long idprovincia;
	private long idpersona;


	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(long iddireccion, String direccion, String codpostal, String localidad, long idprovincia,
			long idpersona) {
		super();
		this.iddireccion = iddireccion;
		this.direccion = direccion;
		this.codpostal = codpostal;
		this.localidad = localidad;
		this.idprovincia = idprovincia;
		this.idpersona = idpersona;
	}
	public Direccion(String calle, String codPostal, String localidad) {
		// TODO Auto-generated constructor stub
		this.direccion = calle;
		this.codpostal = codPostal;
		this.localidad = codPostal;
		
	}


}
