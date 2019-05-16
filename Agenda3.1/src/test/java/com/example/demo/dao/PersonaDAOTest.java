package com.example.demo.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.model.Persona;

import java.sql.Date;


public class PersonaDAOTest {

    @Test
    public void test() {
        IPersonaDAO ipersonaDAO = new PersonaDAO();
        Date date = new Date(0);
        Persona persona = new Persona(4,"dfhdf","dghh","dghgh","gfrhrgeh",date);
        ipersonaDAO.add(persona);
        
        
    }

}

