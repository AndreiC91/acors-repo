package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class JPAService {

	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static
	{
		try
		{
			emf = Persistence.createEntityManagerFactory("myPU");
			em = emf.createEntityManager();
		}
		catch (PersistenceException exception)
		{
			System.out.println("JPAService error!");
			exception.printStackTrace();
		}
	}
	
	public static EntityManager getJPAManager() {
		return em;
	}
}
