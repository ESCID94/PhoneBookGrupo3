package com.example.demo;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Direccion;
import com.example.demo.model.Persona;
import com.example.demo.model.Telefono;
import com.example.demo.services.AgendaService;


// TODO: Auto-generated Javadoc
/**
 * The Class AgendaApplicationTests.
 *
 * @param <T> the generic type
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTests<T> {

	/** The servicios. */
	@Autowired
	AgendaService servicios;
	
	/**
	 * Context loads.
	 */
	@SuppressWarnings({ "deprecation", "null" })
	@Test
	public void contextLoads() {
		//Incluir logger
		//Incluir assert aserciones
		//Guardo la persona y hago una query para asegurarme que me devuelve true
		
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
		
		

		servicios.add(persona);
	}
	

}
