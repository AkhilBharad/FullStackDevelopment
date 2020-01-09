package com.cts.oops;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=new String();
		System.out.println("Enter the courses:");
		a=sc.nextLine();
		int x=0,b=0,c=0,d=0;
		
		if(a.contains("java"))
		{
			x=+5000;
		}	
			
		
		if(a.contains("c"))
		{
			b=+3000;
		}	
			
		
		if(a.contains("c++"))
		{
			c=+2000;
		
		}	
		
		if(a.contains("Angular"))
		{
			d=+10000;
		
		}	
		
		
		
		
		
		
		
	System.out.println(x+b+c+d);
		
		
		
		
	}

}
