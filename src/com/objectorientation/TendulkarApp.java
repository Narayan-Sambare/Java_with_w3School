package com.objectorientation;

public class TendulkarApp {

	public static void main(String[] args) {
		Tendulkar t=new Tendulkar();
		
		 ArjunTendulkar at=new ArjunTendulkar();
		 
		 
		System.out.println("Tendulkar");
		t.job();
		t.speciality();
		
		System.out.println("ArjunTendulkar");
		at.job();
		at.speciality();
		at.smoke();
	}

}
class Tendulkar{
	void job(){
		System.out.println("cricket");
	}
	void speciality() {
		System.out.println("it is batsman");
	}
	
}
class ArjunTendulkar extends Tendulkar{
	void job(){
		System.out.println("cricket");
	}
	void speciality() {
		System.out.println("it is boller");
	}
	void smoke() {
		System.out.println("he smoke some time");
	}
	
}
