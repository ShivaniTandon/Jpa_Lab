package com.capg.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.entities.Author;

public class TestApp4 {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaQues2");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select b from Book b where b.price>=500 and b.price<=1000");
		
        List<Author> authors=(List<Author>)query.getResultList();
		
		for(Author a:authors) {
			System.out.println(a);
		}
		entityManager.close();
		
	}
}
