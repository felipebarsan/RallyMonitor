package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Utils.HibernateUtils.HibernateUtil;

public class DAO {

	private EntityManagerFactory emf;
	public EntityManager getEntityManager(){
		return emf.createEntityManager()
	}
	
	public DAO(){
		emf = Persistence.createEntityManagerFactory(null);
	}
	
	
	
}
