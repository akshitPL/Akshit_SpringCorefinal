package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Address;
import com.springcore.model.Employee;

public class Client {

	public static void main(String[] args) {
		
ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
  
Employee bean= ioc.getBean("emp",Employee.class);
     
      bean.setAddress(bean.byapply());
      System.out.println(bean);
Address a1 = bean.byapply();
a1.setCity("noida");
System.out.println(a1);
//       // bean thro constructor
//      Employee bean2 = ioc.getBean("emp2",Employee.class);
//      System.out.println(bean2);
	}

	
}
