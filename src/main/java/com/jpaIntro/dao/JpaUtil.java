package com.jpaIntro.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;
	private static EntityManager manager;

	static {
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		manager = factory.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		return manager;
	}
}