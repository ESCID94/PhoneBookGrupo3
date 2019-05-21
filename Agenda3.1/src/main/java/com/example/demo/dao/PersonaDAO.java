package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sound.midi.Soundbank;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.model.Persona;
import com.example.demo.model.User;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonaDAO.
 */
@Repository
public class PersonaDAO implements IPersonaDAO {

	/** The entity manager. */
	@PersistenceContext
	EntityManager entityManager;
	
	public PersonaDAO() {}

	public Persona getPersonaById(int id) {
		return entityManager.find(Persona.class, id);
	}
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Persona> list() {
		String hql = "FROM Persona ORDER BY IDPERSONA";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IPersonaDAO#add(com.example.demo.model.Persona)
	 */
	@Override
	@Transactional
	public void add(Persona persona) {
		entityManager.merge(persona);
		
	}

	

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IPersonaDAO#get(int)
	 */
	@Override
	public Persona get(int id) {
		// TODO Auto-generated method stub
		System.out.println(entityManager.find(Persona.class,id).toString());
		
		return entityManager.find(Persona.class, id);
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IPersonaDAO#update(com.example.demo.model.Persona)
	 */
	@Override
	@Transactional
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		Persona person = get(persona.getIdpersona());
		
		person.setNombre(persona.getNombre());
		person.setApellido1(persona.getApellido1());
		person.setApellido2(persona.getApellido2());
		person.setDireccions((persona.getDireccions()));
		person.setDni(persona.getDni());
		person.setFechanacimiento(persona.getFechanacimiento());
		person.setTelefonos(persona.getTelefonos());
	
		entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IPersonaDAO#delete(int)
	 */

	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getPersonaById(id));
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IPersonaDAO#personaDetails(int)
	 */
	@Override
	@Transactional
	public String personaDetails(int id) {
		// TODO Auto-generated method stub
		Persona person = this.get(id);
		
		return person.toString();
	}

}