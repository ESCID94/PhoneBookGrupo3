package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The persistent class for the provincia database table.
 * 
 */
@Entity
@NamedQuery(name="Provincia.findAll", query="SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The idprovincia. */
	@Id
	private int idprovincia;

	/** The provincia. */
	private String provincia;

	/** The direccions. */
	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="provincia")
	private List<Direccion> direccions;

	/**
	 * Instantiates a new provincia.
	 */
	public Provincia() {
	}

	/**
	 * Gets the idprovincia.
	 *
	 * @return the idprovincia
	 */
	public int getIdprovincia() {
		return this.idprovincia;
	}

	/**
	 * Sets the idprovincia.
	 *
	 * @param idprovincia the new idprovincia
	 */
	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	/**
	 * Gets the provincia.
	 *
	 * @return the provincia
	 */
	public String getProvincia() {
		return this.provincia;
	}

	/**
	 * Sets the provincia.
	 *
	 * @param provincia the new provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
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
		direccion.setProvincia(this);

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
		direccion.setProvincia(null);

		return direccion;
	}

}