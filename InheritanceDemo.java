package com.cts.oops;

import java.util.Scanner;

public class InheritanceDemo {
	public static void main(String[] args) {

		Employee employee=new Employee();
		Developer dev= new Developer();
		employee.getData();
		employee.display();
		dev.projectName = "E-Commerce";
		dev.domain ="Full Stack Java";
		System.out.println("Project Name is:"+dev.projectName);
		System.out.println("Domain name is:"+dev.domain);
		
		
	}
		
}	
		
		 class Employee
		 {
			 int id;
			 String name;
			 String company;
			 public void display()
			 {
				 System.out.println(id+":"+name+":"+company);
			 }
			 public void getData()
			 {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter id");
				 id=Integer.parseInt(sc.nextLine());
				 System.out.println("Enter name");
				 name=sc.nextLine();
				 System.out.println("Enter company");
				 company=sc.nextLine();
				 
			 }
		 }
		 class Manager extends Employee
		 {
			 
		 }
		 class Developer extends Employee
		 {
			 String projectName;
			 String domain;
		 }



