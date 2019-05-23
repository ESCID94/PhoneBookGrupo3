package com.example.demo.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;

public class PersonaServiceTest {
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private Persona persona;
//	IPersonaDAO ipersonaDAO = new PersonaDAO();
//	IPersonaService ipersonaService = new PersonaService();
	
	@Test
	   public void testAddPerson() {

	       IPersonaDAO dao = new PersonaDAO();
	       @SuppressWarnings("deprecation")
	        Persona person = new Persona(80,"raposo","vieira", "49017", new java.util.Date(1996, 10, 8),"lucas");
	       System.out.println(person);
	       dao.add(person);
	   }
	
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
	
//	
//	@Test
//	public void deleteTest() throws Exception {
//		when(ipersonaService.add(persona).
//		
//		
//	
//		
//	}

}
