package com.lucatic.grupo3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Persona {

	@Id
	private long idpersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechanacimiento;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int id, String nombre, String apellido) {
		// TODO Auto-generated constructor stub
		this.idpersona = id;
		this.nombre = nombre;
		this.apellido1 = apellido;
	}

	public Persona(long idpersona, String nombre, String apellido1, String apellido2, String dni,
			Date fechanacimiento) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
	}


}
