package com.capgemini;

import com.capgemini.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        try {
            session.beginTransaction();

            Student s = new Student();
            s.setName("Aditya");
            s.setAge(22);

            session.persist(s);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
