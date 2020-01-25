package com.cts.assignments;

import java.util.Scanner;

public class DisplayingUserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Enter Your year of graduation");
		String year=sc.nextLine();
		System.out.println("My name is"+" "+name+" "+"and I'll graduate in"+" "+year);
		
	}

}
