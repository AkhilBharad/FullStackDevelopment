package com.cts.test;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr;
        int length;
        int sum=0;
        System.out.println("Enter the size of the array");
        length=s.nextInt();
        arr =new int[length];
        System.out.println("Enter the numbers: ");  
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=s.nextInt();  
        }  
        for (int i = 0; i < arr.length; i++) {  
            sum=sum+arr[i];  
        }  
        System.out.println("The sum of an array is:"+sum);
        

	}

}
