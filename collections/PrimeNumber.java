package com.cts.collections;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		
		boolean flag = false;
        for(int i = 2; i <= a/2; i++) 
        {
           
            if(a % i == 0) 
            {
                flag = true;
                break;
            }
        }
        if (flag!=true)
            System.out.print(a+" "+ "is a prime number");
        else
        	System.out.println(a+" "+ "is not a prime number");

	}

}
