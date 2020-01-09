 package com.cts.oops;

public class MethodOverloading {
	public static void main (String args[]) {
		Area C =new Area();
		C.Area(5);                
        C.Area(4.6);    
        C.Area(2,2);
        C.Area(9,3.2);          
        C.Area(5.1,2.1);   
		
	}
}
	class Area {
	
	 void Area(int r)                    
     {
         System.out.print("Area of Circle    : " + (3.14 * r * r));
     }

     void Area(double l,double b)           
     {
         System.out.print("Area of Rectangle : " + (l*b));
     }

     void Area(int a,float b)     
     {
         System.out.print("Area of Triangle : " + (a*b));
     }

     void Area(double b)     
     {
         System.out.print("Area of Square : " + (b*b));
     }

     
	}
                

     


