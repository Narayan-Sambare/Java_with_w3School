package com.objectorientation;

public class ParentApp1 {

	public static void main(String[] args) {
		Child1 c=new Child1(90, 999);
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
class Parent1{
	int a;
	int b;
	public Parent1() {
		a=10;
		b=20;
	}
	
}
class Child1 extends Parent1{
	public Child1(int a, int b) {
		this.a = a;
		this.b=b;
	}
	

}
	


