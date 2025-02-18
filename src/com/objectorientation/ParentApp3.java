package com.objectorientation;

public class ParentApp3 {

	public static void main(String[] args) {
		Child6 c =new Child6();
		c.disp();
	}
}
class Parent2{
	final int x=10;
}
class Child6 extends Parent2{
//	int x=20;
	
	public Child6(){
		x= 20;
	}
	
	void disp() {
		
		System.out.println(x);
		System.out.println(super.x);
	}
}
