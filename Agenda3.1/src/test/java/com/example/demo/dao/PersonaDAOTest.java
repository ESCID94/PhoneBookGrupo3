package com.example.demo.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class PersonaDAOTest {

	@Autowired
	PersonaDAO data = new PersonaDAO();	


    @Test
    public void testAddPerson() {
 
        @SuppressWarnings("deprecation")
		Persona person = new Persona(25, "zaiter", "nada", "43434", new Date(25, 2, 2019), "nader");  
        System.out.println(person);
        data.add(person);
    }
}

