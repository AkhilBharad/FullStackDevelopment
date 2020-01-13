package com.cts.test;

import java.util.Scanner;

public class Program13 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr;
        int length;
        System.out.println("Enter the size of the array");
        length=s.nextInt();
        arr =new int[length];
        int arr1[]=new int[length];
        System.out.println("Enter the numbers: ");  
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=s.nextInt();  
        }  
        System.out.println("Elements of old Array:");
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]); 
        }  
        for (int i = 0; i < arr.length; i++) {  
            arr1[i]=arr[i];  
        }  
        System.out.println("Elements of new Array:");
        for (int i = 0; i < arr1.length; i++) {  
            System.out.println(arr1[i]); 
        }  
		
		
		
		
	}

}
