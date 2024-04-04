package com.example.hibernate;

import com.example.utils.HibernateUtils;
import com.sahil.hibernate.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteApp {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();


        if (sessionFactory != null) {

            Session session = sessionFactory.openSession();

            //loading student from db
            Student student = session.get(Student.class, 1);

            session.beginTransaction();

            //deleting
            session.delete(student);

            session.getTransaction().commit();

        }
    }
}
