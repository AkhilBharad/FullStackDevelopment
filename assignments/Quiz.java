package com.cts.assignments;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Are you ready for the Quiz?(Y/N)");
		char ch=sc.next().charAt(0);
		int result=0;
		
		if(ch=='Y')
		{
			System.out.println("Your First Question");
			System.out.println("What is the capital of India\n"
					+ "1.Delhi\n"
					+ "2.Mumbai\n"
					+ "3.Chennai");
			int a=sc.nextInt();
			if(a==1) {
				result++;
				
			}
			System.out.println("Your Second Question");
			System.out.println("Can you store the value \"dog\" in a variable of type int?\n"
					+ "1.Yes\n"
					+ "2.No");
			int b=sc.nextInt();
			if(b==2) {
				result++;
				
			}
			System.out.println("Your Third Question");
			System.out.println("What is the result of 9+9/3?\n"
					+ "1.5\n"
					+ "2.12\n"
					+ "3.15/3");
			int c=sc.nextInt();
			if(c==2) {
				result++;
				
			}
		
			System.out.println("Your Score is:"+" "+result);
			
			
	
			
			}
			
			
			
		
		else
		{
			System.out.println("Its ok,We dont care about you");
		}

	}

}
