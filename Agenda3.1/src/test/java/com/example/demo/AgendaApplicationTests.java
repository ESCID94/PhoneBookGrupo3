package com.example.demo;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Persona;
import com.example.demo.services.PersonaServicios;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTests {

	@Autowired
	PersonaServicios personaServicios = new PersonaServicios();
	@Test
	public void contextLoads() {
		Persona persona = new Persona();
		System.out.println("---------------------------------" + personaServicios.get(1).toString());
		
		persona.setNombre("Enrique");
		persona.setApellido1("Salazar");
		persona.setApellido2("del Cid");
		persona.setDni("51503795");
		persona.setFechanacimiento(new Date(1994, 7, 15));
		persona.setIdpersona(1);
		persona.setDireccions(null);
		persona.setTelefonos(null);

		personaServicios.update(persona);
	}
	
	@Test
	public void personaList() {
		personaServicios.list().forEach(n-> System.out.println(n.toStringEntity()));
	
		
	}

}
