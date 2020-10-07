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
    	
		/* one to one mapping */
		/*
		 * Laptop laptop = new Laptop(6, "asus"); Stu_dent student = new
		 * Stu_dent(191,"Nayan",laptop); 
		 */
    	Configuration configuration =new Configuration().configure().addAnnotatedClass(Stu_dent.class).addAnnotatedClass(Laptop.class);
        SessionFactory factory = configuration.buildSessionFactory();
        try {
			/*
			 * s.save(student); s.save(laptop);
			 */
        	
	       // Student st = s.get(Student.class,5);
        	
			/* CACHING */
        	Session s = factory.openSession();
            Transaction transaction = s.beginTransaction();
        	Laptop student = (Laptop) s.get(Laptop.class,4);
        	System.out.println(student);
        	Laptop student1 = (Laptop) s.get(Laptop.class,4);
        	System.out.println(student1);
	        transaction.commit();
	        s.close();
	        
	        Session s2 = factory.openSession();
	        Transaction trans = s2.beginTransaction();
	        Laptop student2 = (Laptop) s2.get(Laptop.class,4);
        	System.out.println(student2);
        	trans.commit();
	        s2.close();
        }
        catch(Exception e) {
        	 //if(transaction!=null)transaction.rollback();
        	 e.printStackTrace();
        }
        finally {
        	//s.close();
        }        
    }
}
