package com.cts.test;

import java.util.Scanner;

public class Program1 {
	public static void main(String args[]){
	      int num;
	      System.out.println("Enter a number ::");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();

	      if (num > 0){
	         System.out.println("It is a positive integer");
	      } else if(num < 0){
	         System.out.println("It is a negative integer");
	      } else {
	         System.out.println("It is neither positive nor negative integer");
	      }
	   }

}
