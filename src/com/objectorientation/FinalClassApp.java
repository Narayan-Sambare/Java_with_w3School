package com.objectorientation;

public class FinalClassApp {

	public static void main(String[] args) {
		

	}

}

class FinalDemo{
	final int x= 10; 
	
	final void display() {
	
		System.out.println(x);
	}
	
}

class ChildDemo extends FinalDemo{
	void display() {
		
		System.out.println(x);
	}
} 