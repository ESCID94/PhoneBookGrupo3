package com.lucatic.grupo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
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

	public long getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(long iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public long getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(long idprovincia) {
		this.idprovincia = idprovincia;
	}

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", direccion=" + direccion + ", codpostal=" + codpostal
				+ ", localidad=" + localidad + ", idprovincia=" + idprovincia + ", idpersona=" + idpersona + "]";
	}


}
