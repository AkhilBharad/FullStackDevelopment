package com.cts.test;

import java.util.Scanner;

public class Program2 {
	public static void main(String args[]) {
		int a,b,area,peri;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Length and breadth of the rectangle");
		a=sc.nextInt();
		b=sc.nextInt();
		area=a*b;
		peri=2*(a+b);
		System.out.println("Area of the rectangle is:"+area);
		System.out.println("Perimeter of the rectangle is:"+peri);
		
		
	}

}
