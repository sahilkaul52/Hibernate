package com.example.hibernate;

import com.example.utils.HibernateUtils;
import com.sahil.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory(); // sessionFactory is an immutable obj

        if(sessionFactory!=null) {

            Session session = sessionFactory.openSession(); // think of a session as a connection

            Student student = session.get(Student.class, 1);

            student.setName("pbk");
            student.setOrigin("delhi");

            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();

            session.close();

        }

    }
}
