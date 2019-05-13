package com.lucatic.grupo3.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Provincia {
	private Long idprovincia;
	private String provincia;


public Provincia () {
	
}


public Provincia(Long idprovincia, String provincia) {
	super();
	this.idprovincia = idprovincia;
	this.provincia = provincia;
}


public Long getIdprovincia() {
	return idprovincia;
}


public void setIdprovincia(Long idprovincia) {
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

