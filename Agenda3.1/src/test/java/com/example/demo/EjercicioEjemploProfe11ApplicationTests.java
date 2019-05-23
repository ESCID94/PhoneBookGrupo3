package com.example.demo;

import java.util.Date;

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
	@Autowired
	PersonaDAO data = new PersonaDAO();	
	
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
	
	
    @Test
    public void testAddPerson() {
		@SuppressWarnings("deprecation")
		Persona person = new Persona(25, "zaiter", "nada", "43434", new Date(25, 2, 2019), "nader");  
        System.out.println(person);
        data.add(person);
    }
 
    
    @Test
    public void testPersonDetails() {
    	Persona person = new Persona(25, "zaiter", "nada", "43434", new Date(25, 2, 2019), "nader");  
    	data.personaDetails(person.getIdpersona());
    }
    
    @Test
    public void testDeletePerson() {
    	Persona person = new Persona(25, "zaiter", "nada", "43434", new Date(25, 2, 2019), "nader");  
    	System.out.println(person.toString());
    	data.delete(person.getIdpersona());
    }
	
	

}
