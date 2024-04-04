package com.example.hibernate;

import com.example.utils.HibernateUtils;
import com.sahil.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        if (sessionFactory != null) {

            Session session = sessionFactory.openSession();

            session.beginTransaction();  // we need to use transaction only when we are creating, updating, deleting. It is not reqd for reading

            Student student = session.get(Student.class, 2);

            session.getTransaction().commit();

            System.out.println(student);

            session.close();

        }
    }
}
