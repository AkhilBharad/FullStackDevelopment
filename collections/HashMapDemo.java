package com.cts.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj=new HashMap<Integer,String>();
		obj.put(101,"Akhil");
		obj.put(102,"Bharadwaj");
		obj.put(103,"Akhi");
		obj.put(104,"Talamarla");
		obj.put(105,"AkBhar");
		System.out.println(obj);
		System.out.println(obj.get(104));
		for(int i:obj.keySet()) {
			System.out.println(i+" "+obj.get(i));
		}
		for(String i:obj.values()) {
			System.out.println(i);
		}
		
		
		
		
		
		
		

	}

}
