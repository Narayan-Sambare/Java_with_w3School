package com.objectorientation;
public class ManApp {
	public static void main(String[] args) {
		Man m=new Man();
		m=null;//to distroy the Man
		System.out.println("------Bike-------");
		Bike b=new Bike("FZ",250000f);
		System.out.println("Bike brand:- "+b.Brand);
		System.out.println("Bike Cost:- "+b.Cost);
		m.hasA(b);
		System.out.println("------Heart-------");
		System.out.println("Heart work:- "+m.h.getwork());
		System.out.println("Heart weight:- "+m.h.getweight());
		
	
	}
}
class Man{
Heart h=new Heart("pumping ",0.05f);
void hasA(Bike b) {
//	System.out.println(c.brand);
//	System.out.println(c.power);
}
}

class Bike{	
	 String Brand;
	 float Cost;
 public Bike(String Brand,float Cost) {
	 super();
	 this.Brand=Brand;
	 this.Cost=Cost;
 }
 public String getbrand() {
	 return Brand;
 }
 public float getcost() {
	 return Cost;
 }
}
class Heart{
	private String work;
	private float weight;
	public Heart(String work,float weight) {
		 super();
		 this.work=work;
		 this.weight=weight;
	 }
	public String getwork() {
		 return work;
	 }
	 public float getweight() {
		 return weight;
	 }
	
}