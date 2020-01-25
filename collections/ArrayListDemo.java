package com.cts.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Akhil");
		obj.add("Bharadwaj");
		obj.add("Talamarla");
		obj.add("is");
		obj.add("a bad");
		obj.add("guy");
		System.out.println(obj);
		obj.set(5, "boy");
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(1));
		
		for(String i:obj)
		{
			System.out.println(i);
		}
		obj.clear();
		System.out.println(obj);
		
		
		
		

	}

}
