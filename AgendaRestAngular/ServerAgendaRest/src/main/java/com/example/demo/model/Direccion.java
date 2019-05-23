package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;

// TODO: Auto-generated Javadoc
/**
 * The persistent class for the direccion database table.
 * 
 */
@Entity
@NamedQuery(name="Direccion.findAll", query="SELECT d FROM Direccion d")
public class Direccion implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The iddireccion. */
	@Id
	private int iddireccion;

	/** The codpostal. */
	private String codpostal;

	/** The direccion. */
	private String direccion;

	/** The localidad. */
	private String localidad;

	/** The persona. */
	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="idpersona")
	private Persona persona;

	/** The provincia. */
	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumn(name="idprovincia")
	private Provincia provincia;

	/**
	 * Instantiates a new direccion.
	 */
	public Direccion() {
	}

	/**
	 * Gets the iddireccion.
	 *
	 * @return the iddireccion
	 */
	public int getIddireccion() {
		return this.iddireccion;
	}

	/**
	 * Sets the iddireccion.
	 *
	 * @param iddireccion the new iddireccion
	 */
	public void setIddireccion(int iddireccion) {
		this.iddireccion = iddireccion;
	}

	/**
	 * Gets the codpostal.
	 *
	 * @return the codpostal
	 */
	public String getCodpostal() {
		return this.codpostal;
	}

	/**
	 * Sets the codpostal.
	 *
	 * @param codpostal the new codpostal
	 */
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the localidad.
	 *
	 * @return the localidad
	 */
	public String getLocalidad() {
		return this.localidad;
	}

	/**
	 * Sets the localidad.
	 *
	 * @param localidad the new localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Gets the persona.
	 *
	 * @return the persona
	 */
	public Persona getPersona() {
		return this.persona;
	}

	/**
	 * Sets the persona.
	 *
	 * @param persona the new persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * Gets the provincia.
	 *
	 * @return the provincia
	 */
	public Provincia getProvincia() {
		return this.provincia;
	}

	/**
	 * Sets the provincia.
	 *
	 * @param provincia the new provincia
	 */
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Direccion [iddireccion=" + iddireccion + ", codpostal=" + codpostal + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", persona=" + persona + ", provincia=" + provincia + "]";
	}
	
	

}