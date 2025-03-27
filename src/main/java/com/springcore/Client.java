package com.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Address;
import com.springcore.model.Employee;
 
import dp.com.EmployeeDao;



public class Client {

	public static void main(String[] args) {
		
ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
  
     EmployeeDao bean= ioc.getBean("EmployeeDao", EmployeeDao.class);
	     Employee emp1 = new Employee (23, "akshit attri", "MALE", 45225);
	    //bean.saveEmployee(emp1);
	    List<Employee> allEmp = bean.getAllEmp();
	    
	   for(Employee employee :allEmp) {
		   System.out.println(employee);
	   }
	    
	  //  bean.deleteEmployee(23 );
//       // bean thro constructor
//      Employee bean2 = ioc.getBean("emp2",Employee.class);
//      System.out.println(bean2);
	}

	
}
