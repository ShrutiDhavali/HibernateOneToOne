package com.org.HibaernateOneToOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
    	final Logger logger = Logger.getLogger(App.class);
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
       
        Transaction tx=  session.beginTransaction();
          	logger.debug("Tx:" +tx);
    	StudentInfo studentinfo= new StudentInfo();
    	studentinfo.setFName("Shruti");
    	studentinfo.setMName("Basavaraj");
    	studentinfo.setLName("Dhavali");
    	
    	
    	Laptop laptops=new Laptop();
       	laptops.setLpName("HP");
       	session.save(laptops);
       	
       	
    	Student student= new Student();
    	student.setsName(studentinfo);
    	student.setLaptop(laptops);
    	session.save(student);
    	
    	
       
       	
       
    	                
        tx.commit();
        session.close();
       
    }
}
