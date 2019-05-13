package com.lucatic.grupo3;

import java.sql.SQLException;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jca.cci.core.support.CciDaoSupport;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucatic.grupo3.model.Direccion;
import com.lucatic.grupo3.model.Contacto;
import com.lucatic.grupo3.model.Persona;
import com.lucatic.grupo3.model.Telefono;
import com.lucatic.grupo3.model.Provincia;
import com.lucatic.grupo3.repository.ContactoRepository;

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
        Direccion a = new Direccion("calle alvaro", "28001", "Madrid");
        Telefono ph = new Telefono("68686868");
        Provincia pr = new Provincia("Leon");
        Contacto c = new Contacto(151L, p, a, ph, pr);
        ContactoRepository cr = new ContactoRepository();
        cr.save(c);
        cr.delete(c.getId());
        return Optional.ofNullable(c);

    }

    @Test
    public Optional<Contacto> testUpdateContact() throws SQLException {
        Persona p = new Persona(151, "alvaro", "gonzalez");
        Direccion a = new Direccion("calle alvaro"," 28001", "Madrid");
        Telefono ph = new Telefono("68686868");
        Provincia pr = new Provincia("Leon");
        Contacto c = new Contacto(151L, p, a, ph, pr);
        ContactoRepository cr = new ContactoRepository();
        cr.update(c);
        return Optional.ofNullable(c);

    }

}
