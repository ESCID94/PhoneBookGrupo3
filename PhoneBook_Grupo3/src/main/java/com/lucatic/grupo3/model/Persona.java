package com.lucatic.grupo3.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
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

	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechanacimiento=" + fechanacimiento + "]";
	}


}
