package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Book;

public class TestApp1 {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JpaQues2");
		
		EntityManager manager = factory.createEntityManager();
		
		Book b1=new Book(103,"R.K.George",1005,"Compilers",650);
		
		Book b2=new Book(104,"Amartya Sen",1700,"The Present India",900);
		Book b3=new Book(105,"R.K.George",1459,"C Knowledge",450);
		Book b4=new Book(106,"R.Martin",1116,"Politics",754);
		
		
		manager.getTransaction().begin();
		
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		manager.persist(b4);
		
		manager.getTransaction().commit();
		
		System.out.println("data stored in database");
		factory.close();
	}

}
