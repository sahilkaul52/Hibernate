package com.example.utils;

import com.sahil.hibernate.entities.Student;
import org.hibernate.SessionFactory;

public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {  //singleton

        try
        {

            if(sessionFactory==null)
            {
                org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

                configuration.configure();

                configuration.addAnnotatedClass(Student.class);

                SessionFactory sessionFactory = configuration.buildSessionFactory();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("session factory obj not created due to some issue");
        }

            return sessionFactory;


    }

}
