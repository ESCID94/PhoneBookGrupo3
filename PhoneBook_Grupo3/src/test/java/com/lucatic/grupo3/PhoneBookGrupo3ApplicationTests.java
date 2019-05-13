package com.lucatic.grupo3;

import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jca.cci.core.support.CciDaoSupport;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatic.grupo3.model.Address;
import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.model.Persona;
import com.lucatic.grupo3.model.Telefono;
import com.lucatic.grupo3.model.Provincia;
import com.lucatic.grupo3.repository.ContactRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneBookGrupo3ApplicationTests {

	// --------
	// TEST
	// --------

	@Test
	public void contextLoads() {
	}

	@Test
	public Optional<Contacto> testDropContact() throws SQLException {
		Persona p = new Persona(101, "alvaro", "gonzalez");
		Direccion a = new Address("calle alvaro", 10, 2, "4", 28001, "Madrid");
		Telefono ph = new Telefono(68686868);
		Provincia pr = new Provincia(24001, "Leon", "LE", "Espana");
		Contacto c = new Contacto(151L, p, a, ph, pr);
		ContactRepository cr = new ContactRepository();
		cr.save(c);
		cr.delete(c.getId());
		return Optional.ofNullable(c);

	}

	@Test
	public Optional<Contacto> testUpdateContact() throws SQLException {
		Persona p = new Persona(151L, "alvaro", "gonzalez");
		Direccion a = new Direccion("calle alvaro", 10, 2, "4", 28001, "Madrid");
		Telefono ph = new Telefono(68686868);
		Provincia pr = new Provincia(24001L, "Leon", "LE", "Espana");
		Contacto c = new Contacto(151L, p, a, ph, pr);
		ContactRepository cr = new ContactRepository();
		cr.update(c);
		return Optional.ofNullable(c);

	}

}
