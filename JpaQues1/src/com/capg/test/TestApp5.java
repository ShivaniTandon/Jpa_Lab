package com.capg.test;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestApp5 {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaQues1");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Query query = entityManager.createQuery("select a from Author a where a.authorId=151");
		
		Author a = (Author)query.getSingleResult();
		
		System.out.println(a);
				
		
		entityManager.close();		
		
	}

}
