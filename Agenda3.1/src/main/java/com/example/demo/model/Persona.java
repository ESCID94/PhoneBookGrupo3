package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@Table (name = "persona")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The idpersona. */
	@Id
	private int idpersona;

	/** The apellido 1. */
	private String apellido1;

	/** The apellido 2. */
	private String apellido2;

	/** The dni. */
	private String dni;

	/** The fechanacimiento. */
	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	/** The nombre. */
	private String nombre;

	/** The direccions. */
	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="persona")
	private List<Direccion> direccions;

	/** The telefonos. */
	//bi-directional many-to-one association to Telefono
	@OneToMany(mappedBy="persona")
	private List<Telefono> telefonos;

	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
		
	}
	
	public Persona(int idpersona, String apellido1, String apellido2, String dni, Date fechanacimiento, String nombre) {
		super();
		this.idpersona = idpersona;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.nombre = nombre;
	}
	

	public Persona(int idpersona, String apellido1, String apellido2, String dni, Date fechanacimiento, String nombre,
			List<Direccion> direccions, List<Telefono> telefonos) {
		super();
		this.idpersona = idpersona;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.nombre = nombre;
		this.direccions = direccions;
		this.telefonos = telefonos;
	}



	/**
	 * Gets the idpersona.
	 *
	 * @return the idpersona
	 */
	public int getIdpersona() {
		return this.idpersona;
	}

	/**
	 * Sets the idpersona.
	 *
	 * @param idpersona the new idpersona
	 */
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	/**
	 * Gets the apellido 1.
	 *
	 * @return the apellido 1
	 */
	public String getApellido1() {
		return this.apellido1;
	}

	/**
	 * Sets the apellido 1.
	 *
	 * @param apellido1 the new apellido 1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Gets the apellido 2.
	 *
	 * @return the apellido 2
	 */
	public String getApellido2() {
		return this.apellido2;
	}

	/**
	 * Sets the apellido 2.
	 *
	 * @param apellido2 the new apellido 2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Gets the fechanacimiento.
	 *
	 * @return the fechanacimiento
	 */
	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	/**
	 * Sets the fechanacimiento.
	 *
	 * @param fechanacimiento the new fechanacimiento
	 */
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the direccions.
	 *
	 * @return the direccions
	 */
	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	/**
	 * Sets the direccions.
	 *
	 * @param direccions the new direccions
	 */
	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	/**
	 * Adds the direccion.
	 *
	 * @param direccion the direccion
	 * @return the direccion
	 */
	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setPersona(this);

		return direccion;
	}

	/**
	 * Removes the direccion.
	 *
	 * @param direccion the direccion
	 * @return the direccion
	 */
	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setPersona(null);

		return direccion;
	}

	/**
	 * Gets the telefonos.
	 *
	 * @return the telefonos
	 */
	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	/**
	 * Sets the telefonos.
	 *
	 * @param telefonos the new telefonos
	 */
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	/**
	 * Adds the telefono.
	 *
	 * @param telefono the telefono
	 * @return the telefono
	 */
	public Telefono addTelefono(Telefono telefono) {
		getTelefonos().add(telefono);
		telefono.setPersona(this);

		return telefono;
	}

	/**
	 * Removes the telefono.
	 *
	 * @param telefono the telefono
	 * @return the telefono
	 */
	public Telefono removeTelefono(Telefono telefono) {
		getTelefonos().remove(telefono);
		telefono.setPersona(null);

		return telefono;
	}
	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni="
				+ dni + ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre + ", direccions=" + direccions
				+ ", telefonos=" + telefonos + "]";
	}

	public String toStringEntity() {
		// TODO Auto-generated method stub
		String cadena= this.getNombre() + "\n" + this.getApellido1() + "\n" + this.getDni() + "\n" + this.getFechanacimiento();
		return cadena;
	}
	
	



	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni="
				+ dni + ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre + "]";
	}

	@Override
	public String toString() {
		return "Persona [idpersona=" + idpersona + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni="
				+ dni + ", fechanacimiento=" + fechanacimiento + ", nombre=" + nombre + "]";
	}
	
	

}