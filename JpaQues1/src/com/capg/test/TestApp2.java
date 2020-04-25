package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestApp2 {                    //update data on table
	public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaQues1");
			
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			Author author = entityManager.find(Author.class,132);
			
			System.out.println(author);
			
			author.setFirstName("George");
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(author);
			transaction.commit();
			System.out.println(author);
			
			entityManager.close();
		}
		
	}
