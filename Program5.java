package com.cts.test;

import java.util.Scanner;

public class Program5 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the first score");
		int first=sc.nextInt();
		System.out.println("Enter the Second score");
		int second=sc.nextInt();
		int avg=(first+second)/2;
		if((first>75) && (second>75) && (avg>=80) )
			System.out.println("You are selected");
		else {
			System.out.println("You are not selected");
		}
	}

}
