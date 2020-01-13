package com.cts.activity.main;

public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");
		
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY-2);
		
		Thread threadOne=new Thread(firstThread);
		Thread threadTwo=new Thread(secondThread); 
		threadTwo.setPriority(Thread.MIN_PRIORITY+2);
		
		threadOne.start();
		threadTwo.start();
		
		
		

	}

}
class FirstThread implements Runnable
{
	
	Resource resource;
	public FirstThread(Resource resource) {
		
		this.resource=resource;
	}
	public void run() {
		
		resource.display("Second Thread");
	}
}
class SecondThread implements Runnable
{
	
Resource resource;
public SecondThread(Resource resource) {
	
	this.resource=resource;
}
public void run() {
	
	resource.display("Second Thread");
}


}
class Resource
{
	public void display(String message)
	{
		for(int i=1;i<=5;i++) {
			
			System.out.println("message"+i);
		}
	}

}