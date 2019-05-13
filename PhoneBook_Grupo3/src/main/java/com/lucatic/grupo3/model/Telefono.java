package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Telefono {
	private Long idTelefono;
	private String telefono;
	private Long idPersona;

	public Telefono() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefono(Long idTelefono, String telefono, Long idPersona) {
		super();
		this.idTelefono = idTelefono;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Telefono [idTelefono=" + idTelefono + ", telefono=" + telefono + ", idPersona=" + idPersona + "]";
	}

	
	
	
}
