package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agendas {
	@Id
	private long idagendas;
	private long iduser;
	private long idcontacto;

	public long getIdagendas() {
		return idagendas;
	}

	public void setIdagendas(long idagendas) {
		this.idagendas = idagendas;
	}

	public long getIduser() {
		return iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	public long getIdcontacto() {
		return idcontacto;
	}

	public void setIdcontacto(long idcontacto) {
		this.idcontacto = idcontacto;
	}

}
