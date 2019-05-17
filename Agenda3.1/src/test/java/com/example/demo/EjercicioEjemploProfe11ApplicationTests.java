package com.example.demo;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;
import com.example.demo.services.PersonaServicios;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjercicioEjemploProfe11ApplicationTests {

	@Autowired
	PersonaServicios services = new PersonaServicios();
	
	@Test
	public void testBuscarPersona() throws Exception{
		Date mydate = new Date(1992,10,1);
		Persona persona = new Persona(100,"alvaro","alvaro","129129n",mydate,"alvaro",null,null);
		System.out.println(persona.toString());
		int id = persona.getIdpersona();
		services.get(id);
		persona.toString();

	}
	
	@Test
	public void testListarPersonas() throws Exception{
		services.list().forEach(n->System.out.println(n.toString()));

	}
	
	

}
