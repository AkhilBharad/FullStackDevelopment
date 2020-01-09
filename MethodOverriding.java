package com.cts.oops;

public class MethodOverriding {

	public static void main(String[] args) {
		Employee1 emp1=new Developer1();
		emp1.display();
		

	}

}
class Employee1


{
	protected void display()
	{
		System.out.println("Super class Display method");
	}

}
class Developer1 extends Employee1
		{
	
	protected void display()
	{
		System.out.println("Sub class Display method");
	}
	
	
		}