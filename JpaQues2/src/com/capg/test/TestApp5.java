package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.entities.Author;

public class TestApp5 {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaQues2");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select b.name from Book b where b.isbn=1700");
		
		String author =(String) query.getSingleResult();
		
		System.out.println(author);
		
		entityManager.close();
		
	}

}
