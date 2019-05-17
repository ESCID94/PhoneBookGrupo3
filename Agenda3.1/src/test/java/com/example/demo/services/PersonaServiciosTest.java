package com.example.demo.services;

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
