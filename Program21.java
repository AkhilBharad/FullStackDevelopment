package com.cts.oops;

import java.util.Scanner;

public class Program21 {
	
	public static void main(String[] args) {
		Student st=new Student();
		EmployeeTab ex=new EmployeeTab();
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("If you are a student then press1 otherwise press 2");
		a=sc.nextInt();
		if(a==1) {
		st.getData();
		st.display();}
		else if(a==2){
	ex.getData1();
	ex.display1();}
		else 
		{
			System.out.println("You have entered unknown number");
		}
	
	

	}


}
class Student
{
	int id;
	String firstName;
	String lastName;
	int age;
	String course;
	public void display()
	 {
		 System.out.println(id+":"+firstName+":"+lastName+":"+age+":"+course);
	 }
	 public void getData()
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter id");
		 id=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter first name");
		 firstName=sc.nextLine();
		 System.out.println("Enter last name");
		 lastName=sc.nextLine();
		 System.out.println("Enter age");
		 age=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter course");
		 course=sc.nextLine();
		 
	 }
	
	
	
}


class EmployeeTab extends Student
{
	double salary;
	String designation;
	String departmentName;
	
	public void display1()
	 {
		 super.display();
		 System.out.println(salary+":"+designation+":"+departmentName);
		 
		 
	 }
	 public void getData1()
	 {
		 super.getData();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter salary");
		 salary=Integer.parseInt(sc.nextLine());
		 System.out.println("Enter designation");
		 designation=sc.nextLine();
		 System.out.println("Enter department name");
		 departmentName=sc.nextLine();
		 
	 }
	
	
	
}
