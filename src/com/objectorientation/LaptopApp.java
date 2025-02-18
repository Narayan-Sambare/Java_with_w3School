package com.objectorientation;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop l=new Laptop();
//		l=null;//to distroy the laptop
		System.out.println("------charger-------");
		Charger c=new Charger("Dell",45.6f);
		System.out.println("charger brand:- "+c.brand);
		System.out.println("charger power:- "+c.power);
		l.hasA(c);
		System.out.println("------OS-------");
		System.out.println("OS Brand:- "+l.os.brand);
		System.out.println("OS Version:- "+l.os.version);
		
	
	}
}
class Laptop{
os os=new os("win",11.0f);
void hasA(Charger c) {
//	System.out.println(c.brand);
//	System.out.println(c.power);
}
}

class Charger{
	
	
	String brand;
	float power;
 public Charger(String brand,float power) {
	 super();
	 this.brand=brand;
	 this.power=power;
 }
 public String getbrand() {
	 return brand;
 }
 public float getpower() {
	 return power;
 }
}
class os{
	String brand;
	float version;
	public os(String brand,float version) {
		 super();
		 this.brand=brand;
		 this.version=version;
	 }
	public String getbrand() {
		 return brand;
	 }
	 public float getversion() {
		 return version;
	 }
	
}