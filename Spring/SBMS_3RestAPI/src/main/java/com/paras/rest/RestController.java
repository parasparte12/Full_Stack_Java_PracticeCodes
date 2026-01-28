package com.paras.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController    // give anotation of restcontroller /// It return responce(JSON/XML) from this class..
//It also represnt that we are creating restAPI in this class 
public class RestController {
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Heloo paras , welcome to learn RestAPI";
	}
	@GetMapping("/names")
	public String[] name() {
		String name[]= {"paras","Aditya"};
		return name;
		}
	@GetMapping("/FAMT")
	public Map<Integer, String> names() {
		Map<Integer, String> user=new HashMap<Integer,String>();
		user.put(1, "Paras");
		user.put(2, "Javed");
		return user;
	}
	@GetMapping("/student")
	public students  student()
	{
		students s1=new students(1,"Paras");
		return s1;
		
	}

}
