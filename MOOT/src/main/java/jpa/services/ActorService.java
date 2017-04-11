package jpa.services;

import jpa.JPAService;
import jpa.entities.Actor;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ActorService {

	private EntityManager em = JPAService.getJPAManager();
	private EntityTransaction tx = em.getTransaction();
	
	public Actor findActor(Long id) {
		return em.find(Actor.class, id);
	}
}
