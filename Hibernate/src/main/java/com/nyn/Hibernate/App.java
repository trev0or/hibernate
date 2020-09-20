package com.nyn.Hibernate;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nyn.Hibernate.model.Name;
import com.nyn.Hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student();
        Name name = new Name();
        name.setFname("joey");
        name.setLname("tribioni");
        student.setName(name);
        student.setAge(30);
        Configuration configuration =new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session s = factory.openSession();
        Transaction transaction = s.beginTransaction();
        s.save(student);
          Student st = s.get(Student.class,1);
        transaction.commit();
        System.out.println(st);
      
        
        
    }
}
