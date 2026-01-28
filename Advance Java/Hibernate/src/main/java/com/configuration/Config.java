package com.configuration;

import org.hibernate.cfg.Configuration;

import com.entity.Student;

import org.hibernate.SessionFactory;

import java.util.ArrayList;

import org.hibernate.Session;

import org.hibernate.Transaction;


public class Config {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();//SAVE,UPDATE,DELETE,GET
		
		Transaction t=session.beginTransaction();//It req to insert,update and delete
		Student s1=new Student(2,"Prasun",100);
		Student s2=new Student(3,"Meet",99.99);
		Student s3=new Student(4,"Ashwin",99.999);
		
		ArrayList<Student> s=new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student ss:s)
		{
			session.save(ss);
		}
		
		
		t.commit();
		session.close();
		
		
	}

}
