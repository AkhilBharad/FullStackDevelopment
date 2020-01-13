package com.cts.test;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr;
        int length,t=0;
        System.out.println("Enter the size of the array");
        length=s.nextInt();
        arr =new int[length];
        System.out.println("Enter the numbers: ");  
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=s.nextInt();  
        }  
        for (int i = 0; i < arr.length; i++) {  
        	for (int j= i+1; j< arr.length; j++) {  
        		if(arr[i]>arr[j])
        		{
        			t=arr[i];
        			arr[i]=arr[j];
        			arr[j]=t;
        			
        		}
        	}
              
            }
        System.out.println("Maximum number:"+arr[(arr.length)-1]);
        System.out.println("Minimum number:"+arr[0]);
        

	}

}
