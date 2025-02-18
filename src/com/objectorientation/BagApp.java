package com.objectorientation;

public class BagApp {

	public static void main(String[] args) {
		
		Bag b1 = new Bag();
		b1.CarryLuggage();
		b1.brand = "Safari";
		b1.cost = 2100;
		b1.color = "Black";
		System.out.println(b1.brand);
		System.out.println(b1.cost);
		System.out.println(b1.color);	
	}

}

class Bag{
String brand;
int cost;
String color;

void CarryLuggage() {
	System.out.println("Bag helps to Carry Luggage");

}}
