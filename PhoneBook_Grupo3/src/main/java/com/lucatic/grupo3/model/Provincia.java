package com.lucatic.grupo3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
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


}
