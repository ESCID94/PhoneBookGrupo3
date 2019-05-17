package com.example.demo.dao;

import java.sql.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Persona;
import com.example.demo.services.IUserService;
import com.example.demo.services.UserService;



public class PersonaDAOTest {

	@Autowired
	PersonaDAO data = new PersonaDAO();	
	
    @Test
    public void test() {
        IPersonaDAO ipersonaDAO = new PersonaDAO();
        Date date = new Date(0); 
    
    }

    @Test
    public void testAddPerson() {
 
        @SuppressWarnings("deprecation")
		Persona person = new Persona(25, "zaiter", "nada", "43434", new Date(25, 2, 2019), "nader");  
        System.out.println(person);
        data.add(person);
    }
}

