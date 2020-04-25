package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestApp4 {//find data of author
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JpaQues1");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Author author=entityManager.find(Author.class, 151);
		
		System.out.println(author);
		entityManager.close();
	}

}
