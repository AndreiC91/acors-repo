package jpa;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateService {
	
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry serviceRegistry;
	
	static
	{
		try
		{
			serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		}
		catch(HibernateException exception)
		{
			System.out.println("Problem creating session factory!");
			exception.printStackTrace();
		}
	}
	
	public static SessionFactory getSesssionFactory()
	{
		return sessionFactory;
	}
}
