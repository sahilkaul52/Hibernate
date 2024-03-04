package com.example.hibernate;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import com.sahil.hibernate.entities.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class WriteApp {

	public static void main(String[] args) {

		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

		configuration.configure();

		configuration.addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Student student = new Student();
		student.setName("Sum");
		student.setOrigin("kashmir");
		student.setEmail("ks@hotmail.com");

		Student student2 = new Student();
		student2.setName("Priti");
		student2.setOrigin("jammu");
		student2.setEmail("pb@gmail.com");

		
		 session.beginTransaction();
		 
		 session.persist(student);
		  
		 session.getTransaction().commit();
		 
		  session.close();
		 

		Session session2 = sessionFactory.openSession();

		session2.beginTransaction();

		session2.persist(student2);

		session2.getTransaction().commit();

		session2.close();

	}

}
