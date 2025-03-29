package com.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Address;
import com.springcore.model.Employee;
 
import dp.com.EmployeeDao;



public class Client {

	public static void main(String[] args) {
		
ApplicationContext ioc = new AnnotationConfigApplicationContext("com.springcore");
  
     Employee emp= ioc.getBean("employee", Employee.class);
     Address ad = ioc.getBean("address",Address.class );
	   Employee emp1 = new Employee (23, "akshit attri", "MALE", 45225, ad); 
	   
	   ad.setCity("gha");
	   ad.setState("up");
	     System.out.println(emp1);
	   
	}

	
}
