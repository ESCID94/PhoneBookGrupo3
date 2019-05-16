package com.example.demo.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.demo.model.User;

public class UserDAOTest {

	@Test
    public void testDetailsUser() {
        
        IUserDAO dao  = new UserDAO();
        
        User user = new User(11, "Nader", "3432", "ddscz");
        
        dao.userDetails(user.getId());
        
    }

}
