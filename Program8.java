package com.cts.test;

import java.util.Scanner;

public class Program8 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		if ((age>5)&&(age<=12)) {
			System.out.println("You are a child");
		}
		else if ((age>12)&&(age<=19)) {
			System.out.println("You are a teenager");
		}
		
		else if ((age>20)&&(age<=35)) {
			System.out.println("You are an adult");
		}
		else if ((age>36)&&(age<=45)) {
			System.out.println("You are a matured person");
		}
		else if ((age>46)&&(age<=55)) {
			System.out.println("You are an elder person");
			
		}
		else if ((age>56)) {
			System.out.println("You are a senior citizen");
		}
		else {
			System.out.println("You have entered wrong age");
		}
			
	}

}
