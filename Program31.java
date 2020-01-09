package com.cts.oops;

public class Program31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0;
		    for(int i = 56; i<=1566; i++)
		    {
		        String number = String.valueOf(i);
		        while(number.contains("1"))
		        {
		            number= number.substring(number.indexOf("1")+1);
		            count ++;
		        }
		    }
		    System.out.println(count);

	}

}
