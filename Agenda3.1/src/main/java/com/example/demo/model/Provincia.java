package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provincia {
	@Id
	private long idprovincia;
	private String provincia;

	public long getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(long idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
