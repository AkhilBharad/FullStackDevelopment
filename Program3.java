package com.cts.test;

import java.util.Scanner;

public class Program3 {

	public static void main(String args[]) {
		int ApplePrice=100;
		int SamsungPrice=200;
		int VivoPrice=300;
		int MiPrice=400;
	
	Scanner sc= new Scanner(System.in);  
	System.out.println("Enter a Product name ");  
	String str= sc.nextLine();  
	System.out.println("Enter the quantity ");  
	int quan= sc.nextInt();  
	System.out.println("The product name is: "+str);   
	if(str.equals("Apple")) {
		int total=ApplePrice*quan;
		System.out.println("Total price is:"+total);
	}
	else if(str.equals("Samsung")) {
		int total=SamsungPrice*quan;
		System.out.println("Total price is:"+total);
	}
	else if(str.equals("Vivo")) {
		int total=VivoPrice*quan;
		System.out.println("Total price is:"+total);
	}
	else if(str.equals("Mi")) {
		int total=MiPrice*quan;
		System.out.println("Total price is:"+total);
	}
	else {
		System.out.println("You have entered unknown product");
	}
	
	
	}

} 
