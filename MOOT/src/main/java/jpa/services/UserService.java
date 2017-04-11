package jpa.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import jpa.JPAService;
import jpa.entities.User;

public class UserService {

	EntityManager em =JPAService.getJPAManager();
	EntityTransaction tx = em.getTransaction();
	
	//defining CRUD operations
	
	//defining CREATE
	public User createUser(String username, String password, String first_name, String last_name) {
		//create user object
		User user = new User();
		//set values to object
		user.setUsername(username);
		user.setPassword(password);
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		//open transaction and persist object to db
		tx.begin();
		em.persist(user);
		tx.commit();
		//return persisted object
		user = findByUsername(user.getUsername());
		return user;
	}
	
	//defining READ
	public User findByUsername(String username) {
		TypedQuery<User> query = em.createNamedQuery(User.FIND_BY_USERNAME, User.class);
		query.setParameter(1,username);
		User user = query.getSingleResult();
		return user;
	}
	
	//defining UPDATE
	public User update(User user) {
		User userToBeUpdated = em.merge(user);
		tx.begin();
		userToBeUpdated.setPassword(user.getPassword());
		userToBeUpdated.setIsAvailable(user.getIsAvailable());
		userToBeUpdated.setFirst_name(user.getFirst_name());
		userToBeUpdated.setLast_name(user.getLast_name());
		userToBeUpdated.setShowName(user.getShowName());
		userToBeUpdated.setPoints(user.getPoints());
		tx.commit();
		return userToBeUpdated;
	}
	
	//defining DELETE
	public void removeUser(User user) {
		User userToBeDeleted = em.merge(user);
		em.remove(userToBeDeleted);
	}
	
	//printing for test purposes
	public void printUser(User user) {
		StringBuilder printuser = new StringBuilder();
		printuser.append("USER:ID="+user.getId());
		printuser.append("USERNAME="+user.getUsername());
		printuser.append("PASSWORD="+user.getPassword());
		printuser.append("AVAILABLE="+user.getIsAvailable());
		printuser.append("FIRSTNAME="+user.getFirst_name());
		printuser.append("LASTNAME+"+user.getLast_name());
		printuser.append("SHOWNAME="+user.getShowName());
		printuser.append("POINTS="+user.getPoints());
		System.out.println(printuser);
	}
}
