package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
// TODO: Auto-generated Javadoc

/**
 * The Class UserDAO.
 */
@Repository
public class UserDAO implements IUserDAO {

	/** The entity manager. */
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Instantiates a new user DAO.
	 */
	public UserDAO() {}

	/**
	 * Gets the user by id.
	 *
	 * @param id the id
	 * @return the user by id
	 */
	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}
	
	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#list()
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<User> list() {
		String hql = "FROM User ORDER BY USER_ID";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#get(int)
	 */
	@Override
	public User get(int id) {
		return entityManager.find(User.class, id) ;
	}
	
	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#update(com.example.demo.model.User)
	 */
	@Override
	public void update(User user) {
        User usuario = getUserById(user.getId());
		
		usuario.setUsername(user.getUsername());
		usuario.setEmail(user.getEmail());
		usuario.setPassword(usuario.getPassword());
		
		entityManager.flush();
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#add(com.example.demo.model.User)
	 */
	@Override
	public void add(User user) {
		entityManager.merge(user);
		
	}

	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#delete(int)
	 */
	@Override
	@Transactional
	public void delete(int id) {
		entityManager.remove(getUserById(id));
		
	}
	
	/* (non-Javadoc)
	 * @see com.example.demo.dao.IUserDAO#userDetails(int)
	 */
	@Override
    @Transactional
    public String userDetails(int id) {
        User usuario = this.getUserById(id);
        
        return usuario.toString();        
    }

}
