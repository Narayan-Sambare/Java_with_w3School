package com.objectorientation;

public class fanapp {

	public static void main(String[] args) {
		
		Fan s1=new Fan();
		s1.rotate();
		s1.blowair();
		s1.brand="bajaj";
		s1.cost=1500;
		s1.colour="black";
		System.out.println(s1.brand);
		System.out.println(s1.cost);
		System.out.println(s1.colour);
		
	}

}
class Fan{
	String brand;
	int cost;
	String colour;
	
	void rotate() {
		System.out.println("fan is rotating");
	}
	void blowair() {
		System.out.println(" blow air");
	}

}