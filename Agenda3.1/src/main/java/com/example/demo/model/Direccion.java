package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Direccion {
	@Id
	private long iddireccion;
	private String direccion;
	private String codpostal;
	private String localidad;
	private long idprovincia;
	private long idpersona;

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

}
