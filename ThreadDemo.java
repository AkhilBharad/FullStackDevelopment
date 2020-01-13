package com.cts.activity.main;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println(thread.getName());
		thread.setName("CTS Thread");
		System.out.println(thread.getName());
		System.out.println(thread.isDaemon());
		System.out.println(thread.isAlive());
		System.out.println(thread.getState());
		System.out.println(thread.getId());
		
		
		

	}

}
