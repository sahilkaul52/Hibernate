package com.example.hibernate;

import com.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sahil.hibernate.entities.Student;

public class WriteApp {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {

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

}
