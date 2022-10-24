package com.nemo.hibernate.demo;

import com.nemo.hibernate.demo.entity.Course;
import com.nemo.hibernate.demo.entity.Instructor;
import com.nemo.hibernate.demo.entity.InstructorDetail;
import com.nemo.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteJAVACourseDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            int javaId = 10;
            Course java = session.get(Course.class, javaId);
            session.delete(java);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
