package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Direccion {
	private Long idDireccion;
	private String direccion;
	private String codigoPostal;
	private String localidad;
	private Long idProvincia;
	private Long idPersona;
	
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(Long idDireccion, String direccion, String codigoPostal, String localidad, Long idProvincia,
			Long idPersona) {
		super();
		this.idDireccion = idDireccion;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.idProvincia = idProvincia;
		this.idPersona = idPersona;
	}

	public Long getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Direccion [idDireccion=" + idDireccion + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal
				+ ", localidad=" + localidad + ", idProvincia=" + idProvincia + ", idPersona=" + idPersona + "]";
	}
	
	
	
}