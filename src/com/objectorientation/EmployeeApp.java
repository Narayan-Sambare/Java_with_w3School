package com.objectorientation;

public class EmployeeApp {

	public static void main(String[] args) {	
	JEmployee	j = new JEmployee(90, 60, 30);
	System.out.println(j.a);
	System.out.println(j.b);
}
}
class Employee1{
	int a = 10;
	int b = 20;	
}
class JEmployee extends Employee1{

	public JEmployee() {
		super();
		System.out.println("0 paramererise constructor Call");
	}
	public JEmployee(int a) {
	this();
	System.out.println("1 paramererise constructor Call");
}
	public JEmployee(int a, int b) {
	this(a);
	System.out.println("2 paramererise constructor Call");
}
	public JEmployee(int a, int b, int c) {
	this(a,b); 
	System.out.println("3 paramererise constructor Call");
      this.a = a; 
     this.b = b;
}	
}
	
