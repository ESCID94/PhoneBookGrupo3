package com.example.demo.services;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Test;

import com.example.demo.model.Direccion;
import com.example.demo.model.Persona;

public class PersonaServiciosTest {

	@Test
	public void test() {
		Persona persona = new Persona();
		
		persona.setNombre("Enrique");
		persona.setApellido1("Salazar");
		persona.setApellido2("del Cid");
		persona.setDni("51503795");
		persona.setFechanacimiento(new Date(1994,7,15));
		persona.setIdpersona(1);
		persona.setDireccions(null);
		persona.setTelefonos(null);
		
		PersonaServicios personaServicios = new PersonaServicios();
		personaServicios.update(persona);
	}
import java.sql.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;


public class PersonaServiciosTest {

	@Autowired
	PersonaDAO dao;
	
	@Test
	public void testBuscarPersona() throws Exception{
		Date mydate = new Date(1992,10,1);
		Persona persona = new Persona(100,"alvaro","alvaro","129129n",mydate,"alvaro",null,null);
		System.out.println(persona);
		PersonaServicios services = new PersonaServicios();
		int id = persona.getIdpersona();
		services.get(id);
		persona.toString();

	}
	

}
