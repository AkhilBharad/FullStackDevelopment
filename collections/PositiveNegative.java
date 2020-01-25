package com.cts.collections;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
    	Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is positive or negative");
       int number=sc.nextInt();
        if (number < 0)
            System.out.println(number + " is a negative number.");
      
        else
            System.out.println(number + " is a positive number.");
     
        
}
}