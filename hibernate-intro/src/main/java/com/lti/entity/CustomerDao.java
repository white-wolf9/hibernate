package com.lti.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDao {
	public void databaseilAddSeiyavum(Customer customer) {
		//step1 load/create entitymanagerfactory object
		//during this step META-INF /persistence.xml is read
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		
        //step 2.load/create EntityManager Object
		EntityManager em=emf.createEntityManager();
		
		//step 3.start/participate in transaction
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		//now we can update/select/insert/delete whatever we want
		em.persist(customer);
		tx.commit();
		
		//below code should be in finally block
		em.close();
		emf.close();
	}

	public Customer DatabaseIlvangudhal(int custId) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		
		EntityManager em=emf.createEntityManager();
		
		Customer c=em.find(Customer.class, custId);
		
		em.close();
		emf.close();
		return c;
	}
	
	public void DatabasiUpdateSeyavum(Customer customer) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		em.merge(customer);
		tx.commit();
		em.close();
		emf.close();
		
	}
}
