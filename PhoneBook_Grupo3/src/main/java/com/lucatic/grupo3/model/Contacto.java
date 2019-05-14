package com.lucatic.grupo3.model;


import lombok.Data;


public class Contacto {
	
	private Long id;
	private Persona persona;
	private Direccion direccion;
	private Telefono telefono;
	private Provincia provincia;

	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacto(Long id, Persona persona, Direccion direccion, Telefono telefono, Provincia provincia) {
		super();
		this.id = id;
		this.persona = persona;
		this.direccion = direccion;
		this.telefono = telefono;
		this.provincia = provincia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", persona=" + persona + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", provincia=" + provincia + "]";
	}

	
	

	
}
