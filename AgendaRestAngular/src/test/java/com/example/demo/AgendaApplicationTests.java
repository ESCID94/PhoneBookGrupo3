package com.example.demo;

import java.awt.List;
import java.io.Serializable;
import java.sql.Date;

import org.hibernate.mapping.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Direccion;
import com.example.demo.model.Persona;
import com.example.demo.model.Telefono;
import com.example.demo.services.AgendaService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTests<T> {

	@Autowired
	AgendaService<T, Serializable> servicios;
	@SuppressWarnings("deprecation")
	@Test
	public void contextLoads() {
		Persona persona = new Persona();
		System.out.println("---------------------------------" + servicios.get(1).toString());
		
		persona.setNombre("Alvaro");
		persona.setApellido1("Gonzalez");
		persona.setApellido2("Ano");
		persona.setDni("51503795");
		persona.setFechanacimiento(new Date(1994, 7, 15));
		persona.setIdpersona(7);
		java.util.List<Direccion> directions = null;
		Direccion direccion = new Direccion();
		direccion.setPersona(persona);
		direccion.setLocalidad("SEVILLA");
		directions.add(direccion);
		persona.setDireccions(directions);
		java.util.List<Telefono> tels = null;
		Telefono tel =  new Telefono();
		tel.setIdtelefono(7);
		tel.setPersona(persona);
		tel.setTelefono("609353973");
		persona.setTelefonos(tels);

		servicios.add((T) persona);
	}
	
	@Test
	public void personaList() {
		servicios.list().forEach(n-> System.out.println(((Persona) n).toStringEntity()));
	
		
	}
	
	@Test 
	public void eliminar() {
		
		
	}

}
