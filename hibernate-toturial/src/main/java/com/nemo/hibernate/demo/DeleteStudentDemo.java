package com.nemo.hibernate.demo;

import com.nemo.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            int studentId = 1;
            Student student = session.get(Student.class, studentId);
            session.getTransaction().commit();
            //-------------------------
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete from Student where id = 1").executeUpdate();
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
