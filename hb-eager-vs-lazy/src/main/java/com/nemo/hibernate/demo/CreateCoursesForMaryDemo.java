package com.nemo.hibernate.demo;

import com.nemo.hibernate.demo.entity.Course;
import com.nemo.hibernate.demo.entity.Instructor;
import com.nemo.hibernate.demo.entity.InstructorDetail;
import com.nemo.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCoursesForMaryDemo {
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
            int maryId = 2;
            Student mary = session.get(Student.class, maryId);
            System.out.println(mary);
            System.out.println(mary.getCourses());


            Course c = new Course("Rubik");
            Course c2 = new Course("PS4");

            c.addStudent(mary);
            c2.addStudent(mary);

            session.save(c);
            session.save(c2);


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
