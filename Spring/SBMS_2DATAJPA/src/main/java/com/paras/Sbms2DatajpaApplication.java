package com.paras;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.paras.entity.Book;
import com.paras.repositry.BookRepositry;

@SpringBootApplication
public class Sbms2DatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(Sbms2DatajpaApplication.class, args);
		BookRepositry bean=context.getBean(BookRepositry.class);
		System.out.println(bean.getClass().getName());
		
		
	}
	
	@Autowired 
	BookRepositry bookRepositry;
	
	@Override
	public void run(String... args) throws Exception { 
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookAuthor("Ashwin");
		//book.setBookID();   no need this because it will come automatic
		book.setBookName("M_rr_");
		book.setBookprice(143.);
		book.setBookQuantity(1432);
		bookRepositry.save(book);
		
		
	}

}
