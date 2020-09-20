package com.nyn.Hibernate;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        student.setName("abc");
        student.setAge(3);
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
