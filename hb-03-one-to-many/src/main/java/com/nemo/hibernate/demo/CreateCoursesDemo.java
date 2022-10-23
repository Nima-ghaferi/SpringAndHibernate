package com.nemo.hibernate.demo;

import com.nemo.hibernate.demo.entity.Course;
import com.nemo.hibernate.demo.entity.Instructor;
import com.nemo.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            int id = 1;
            Instructor instructor = session.get(Instructor.class, id);
            Course course1 = new Course("Pinball");
            Course course2 = new Course("Guitar");
            Course course3 = new Course("Java");
            Course course4 = new Course(".net");
            Course course5 = new Course("Python");

            instructor.add(course1);
            instructor.add(course2);
            instructor.add(course3);
            instructor.add(course4);
            instructor.add(course5);

            session.save(course1);
            session.save(course2);
            session.save(course3);
            session.save(course4);
            session.save(course5);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
