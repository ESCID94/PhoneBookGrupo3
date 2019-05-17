package com.example.demo;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.PersonaDAO;
import com.example.demo.model.Persona;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EjercicioEjemploProfe11ApplicationTests {
	
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
