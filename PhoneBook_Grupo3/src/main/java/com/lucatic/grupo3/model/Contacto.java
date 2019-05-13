package com.lucatic.grupo3.model;


import lombok.Data;

@Data
public class Contacto {
	
	private Long id;
	private Persona persona;
	private Direccion direccion;
	private Telefono telefono;
	private Provincia provincia;
	
	public Contacto(Long id, Persona persona, Direccion direccion, Telefono telefono, Provincia provincia) {
		super();
		this.id = id;
		this.persona = persona;
		this.direccion = direccion;
		this.telefono = telefono;
		this.provincia = provincia;
	}

	

	
}
