package com.objectorientation;

public class ParentApp {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.x);
		System.out.println(c.y);
		
		
			
	
	}
}
class GrandParent{
	int x=10;
}
class Parent extends GrandParent{
	int y=20;
}
class Child extends Parent{
	
}

