package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjercicioEjemploProfe11ApplicationTests {
	@Autowired
	IPersonaDAO data = new PersonaDAO();
	@Test
	   public void testAddPerson() {

	       @SuppressWarnings("deprecation")
	        Persona person = new Persona(80,"raposo","vieira", "49017", new java.util.Date(1996, 10, 8),"lucas");
	       System.out.println(person);
	       data.add(person);
	   }

	@Test
	public void testDeletePerson() {
		
		testAddPerson();
		data.delete();
	}
	@Test
	public void contextLoads() {
	}

}
