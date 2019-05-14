package com.lucatic.grupo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Provincia {
	@Id
	private long idprovincia;
	private String provincia;
	

	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Provincia(long idprovincia, String provincia) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
	}
	
	public Provincia(String provincia) {
		// TODO Auto-generated constructor stub
		this.provincia = provincia;
	}

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

	@Override
	public String toString() {
		return "Provincia [idprovincia=" + idprovincia + ", provincia=" + provincia + "]";
	}
}
