package com.cts.oops;

public class StringClass {

	public static void main(String[] args) {
		String a="Thursday 9 January 202";
		String b="Bharadwaj";
		String c="Akhil";
		c="T Akhil";
		String [] date=a.split("d");
		int sum=date.length;
		System.out.println(sum);
		
		a.replace(indexOf("T"),indexOf("y","Wednesday"));
		
		
		
		
		
		for(int i=0;i<date.length;i++)
		{
			System.out.println(date[i]);
			
		}
		
		
		String string1=new String("Akhil");
		String string2=new String("Bharadwaj");
		String string3=new String("Akhil");
		string3=new String("T Akhil");
		System.out.println(string1==string3);

	}

}
