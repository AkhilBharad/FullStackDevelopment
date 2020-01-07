package com.cts.test;

import java.util.Scanner;

public class Program6 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the hours");
		int hours=sc.nextInt(); 
		System.out.println("Enter the resources");
		int resc=sc.nextInt();
		int pro=hours*resc;
		System.out.println("Productive hours are:"+pro);
	}
	
}
