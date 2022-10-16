package com.nemo.hibernate.demo;

import com.nemo.hibernate.demo.entity.Student;
import org.hibernate.DuplicateMappingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.sound.midi.Soundbank;

public class ReadStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            System.out.println("Creating a new Student object...");
            Student student = new Student("Daffy", "Duck", "daffy@g.com");
            session.beginTransaction();
            System.out.println("Saving the Student...");
            System.out.println(student);
            session.save(student);
            session.getTransaction().commit();

            System.out.println("the generated id: " + student.getId());
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Getting student with the id:" + student.getId());
            Student daffy = session.get(Student.class, student.getId());
            System.out.println("Get Complete:" + daffy);
            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
