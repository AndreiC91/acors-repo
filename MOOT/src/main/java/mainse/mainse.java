package mainse;

import org.hibernate.Session;

import jpa.HibernateService;
import jpa.entities.User;
import jpa.services.UserService;

public class mainse {

	public static void main (String[] args) {
		System.out.println("Java project!");
		String username = "usertest";
		String password = "passtest";
		String first_name = "fntest";
		String last_name = "lntest";
		System.out.println("Let's insert a user with username="+username+" and password="+password);
		//UserService us = new UserService();
		
		/*for (int i=0; i<10; i++) {
			User user = us.createUser(username+i, password+i, first_name+i, last_name+i);
			us.printUser(user);
		}*/
		
		
		Session s = HibernateService.getSesssionFactory().openSession();
		
		s.beginTransaction();
				User user = new User();
		user.setUsername("HIBERNATE USER6");
		user.setPassword("HIBERNATE PASSWORD6");
		s.save(user);		
		s.getTransaction().commit();;
		
		s.beginTransaction();
		User userGot = (User) s.load(User.class, 11);
		System.out.println(userGot.getUsername());
		System.out.println(userGot.getPassword());
		s.getTransaction().commit();
		
		s.close();
		HibernateService.getSesssionFactory().close();
		
	}
}
