package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the telefono database table.
 * 
 */
@Entity
@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Telefono implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The idtelefono. */
	@Id
	private int idtelefono;

	/** The telefono. */
	private String telefono;

	/** The persona. */
	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="idpersona")
	private Persona persona;

	/**
	 * Instantiates a new telefono.
	 */
	public Telefono() {
	}

	/**
	 * Gets the idtelefono.
	 *
	 * @return the idtelefono
	 */
	public int getIdtelefono() {
		return this.idtelefono;
	}

	/**
	 * Sets the idtelefono.
	 *
	 * @param idtelefono the new idtelefono
	 */
	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	@Override
	public String toString() {
		return "Telefono [idtelefono=" + idtelefono + ", telefono=" + telefono + ", persona=" + persona + "]";
	}
	
	

}