package com.example.demo.services;
import java.sql.Date;
import org.junit.Test;
import com.example.demo.model.Persona;

public class PersonaServiciosTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Persona persona = new Persona();
		
		persona.setNombre("Enrique");
		persona.setApellido1("Salazar");
		persona.setApellido2("del Cid");
		persona.setDni("51503795");
		persona.setFechanacimiento(new Date(1994,7,15));
		persona.setIdpersona(1);
		persona.setDireccions(null);
		persona.setTelefonos(null);
		
		PersonaServicios personaServicios = new PersonaServicios();
		personaServicios.update(persona);
	}

}
