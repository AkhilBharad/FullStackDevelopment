package com.cts.test;

import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] arr;
		int [] arr1;
		int [] arr2;
        int length;
   
        System.out.println("Enter the size of the array");
        length=s.nextInt();
        arr =new int[length];
        arr1 =new int[length];
        arr2 =new int[length];
        System.out.println("Enter the numbers: ");  
        for (int i = 0; i < arr.length; i++) {  
            arr[i]=s.nextInt();  
        }  
        for (int i = 0; i < arr.length; i++) 
        { 
        	
        if(arr[i]%2==0) {
        	
        	arr1[i]=arr[i];
   
        	}
        else {
        	arr2[i]=arr[i];
        	}
        }
        for (int i = 0; i < arr1.length; i++)	
        { 
        	if(arr1[i]>0) {
        	System.out.println("even elements are:"+arr1[i]);
        	}
        	
        }
for (int i = 0; i < arr2.length; i++) 
        	
        	
        { 
	if (arr2[i]>0) 
	{
        	System.out.println("0dd elements are:"+arr2[i]);
	}
        	
        }
        
	
	
	
	}
}
