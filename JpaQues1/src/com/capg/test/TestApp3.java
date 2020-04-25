package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestApp3 { //delete data on table
	
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaQues1");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Author author = entityManager.find(Author.class, 122);
		
		if(author!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(author);
			
			entityManager.getTransaction().commit();
			System.out.println("object is removed from database");
		}
		else{
			System.out.println("object is not availble.!");
		}
		
				
		entityManager.close();		
		
	}
	
}
