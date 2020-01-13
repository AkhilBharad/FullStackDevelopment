package com.cts.test;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		     
		        int [] arr;
		        int length;
		        System.out.println("Enter the size of the array");
		        length=s.nextInt();
		        arr =new int[length];
		        System.out.println("Enter the numbers: ");  
		        for (int i = 0; i < arr.length; i++) {  
		            arr[i]=s.nextInt();  
		        }  
		        System.out.println();  
		        System.out.println("Array in reverse order: ");  
		    
		        for (int i = arr.length-1; i >= 0; i--) {  
		            System.out.print(arr[i] + " ");  
		        }  
		    }  



}
