package com.paras;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paras.service.ReportService;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		ReportService service=context.getBean(ReportService.class);
		
		service.generateReport();
		
		 
	}

}
