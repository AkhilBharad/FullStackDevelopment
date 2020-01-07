package com.cts.test;

import java.util.Scanner;

public class Program4 {
	public static void main(String args[]) {
		int crt=20000;
		int lcd=30000;
		Scanner sc= new Scanner(System.in);  
		System.out.println("Enter a TV name ");  
		String str= sc.nextLine(); 
		if(str.equals("CRT")) {
			float disc=(float) (0.05*crt);
			System.out.println("Total discount is:"+disc);
		}
		else if(str.equals("LCD")) {
			System.out.println("Enter size of the TV Screen:");
			int size=sc.nextInt();
			if(size==14)
			{
				float disc=(float) (0.08*lcd);
				System.out.println("Total discount is:"+disc);
			}
			else if(size==21)
			{
				float disc=(float) (0.1*lcd);
				System.out.println("Total discount is:"+disc);
				}
				else {
					System.out.println("You have entered wrong size");
				}
			
			
		}
		else {
			System.out.println("You have entered unknown product");
		}
		
		
		
		}

}
