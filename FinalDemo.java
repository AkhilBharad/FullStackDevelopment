package com.cts.oops;

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo=new Demo();
		Demo demo1=new Demo();
		System.out.println(demo.AKHIL);
		System.out.println(demo1.AKHIL);

	}

}
class Demo
{
	public final int AKHIL;
	Demo()
	{
		AKHIL=124;
	}
	Demo(int a)
	{
		AKHIL=125;
	}
}
