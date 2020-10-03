package com.nyn.Hibernate;


import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nyn.Hibernate.model.Laptop;
import com.nyn.Hibernate.model.Name;
import com.nyn.Hibernate.model.Stu_dent;
import com.nyn.Hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * System.out.println( "Hello World!" ); Student student = new Student(); Name
		 * name = new Name(); name.setFname("chandler"); name.setLname("bing");
		 * student.setName(name); student.setAge(31);
		 */
    	Laptop laptop = new Laptop();
    	laptop.setLname("lenovo");
    	laptop.setLid(4);
    	Stu_dent student = new Stu_dent();
    	student.setName("naveen");
    	student.setId(1);
    	student.setLaptop(laptop);
        Configuration configuration =new Configuration().configure().addAnnotatedClass(Stu_dent.class).addAnnotatedClass(Laptop.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session s = factory.openSession();
        Transaction transaction = s.beginTransaction();
        try {
	        s.save(student);
	        s.save(laptop);
	       // Student st = s.get(Student.class,5);
	        
	        transaction.commit();
	       // System.out.println(st);
        }
        catch(Exception e) {
        	 //if(transaction!=null)transaction.rollback();
        	 e.printStackTrace();
        }
        finally {
        	s.close();
        }        
    }
}
