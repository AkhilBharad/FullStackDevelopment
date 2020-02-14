package com.cts.training.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


import com.cts.training.dao.EmployeeDAO;
import com.cts.training.model.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
		
		
//		Employee employee=new Employee(2,"jerru",8898678976l,"jerry@gmail.com");
//		System.out.println(employeeDAO.saveEmployee(employee));
//		System.out.println(employeeDAO.getAllEmployees());
//	
		 //update
		Employee update = employeeDAO.getEmployeeById(2);
		update.setEmpName("Jeddi");
		update.setEmail("jeddi@gmail.com");
		boolean status2 = employeeDAO.updateEmployee(update);
		if (status2) {
			System.out.println("employee updated Successfully");
		} else {
			System.out.println("Try Again");
		}
		// deletion
//		Employee delete = employeeDAO.getEmployeeById(2);
//		boolean status1 = employeeDAO.deleteEmployee(delete);
//		if (status1) {
//			System.out.println("employee deleted Successfully");
//		} else {
//			System.out.println("Try Again");
//		}
		
	

}
	
}
