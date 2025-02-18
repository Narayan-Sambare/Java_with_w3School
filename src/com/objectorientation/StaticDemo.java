package com.objectorientation;

public class StaticDemo {
  public static void main(String[] args) {
	  staticData sd = new staticData();
	  staticData.disp();
	  sd.disp2();
  }
}

class staticData{
	static int a ; 
	static int b;
	int x;
	int y;
	
	static {
		a = 10; 
		b= 20; 
//		x = 30;
//		y = 40; 
	}
	
	static void disp() {
		System.out.println("static Variable");
		System.out.println(a);
		System.out.println(b);
//		System.out.println(x);
//		System.out.println(y);
		
	}
	
	{
		x = 30;
		y = 40;
		a=50;
		b=60;
	}
	
	void disp2() {
		System.out.println("static Variable");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
