package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestApp1 {                        //insert data in table
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaQues1");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Author a1=new Author();
		a1.setAuthorId(121);
		a1.setFirstName("George");
		a1.setMiddleName("R.");
		a1.setLastName("Martin");
		a1.setPhoneNo(987651212);
		
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(a1);
		entityTransaction.commit();
		System.out.println("object is saved");
		
		 entityManager.close();
	}
}
