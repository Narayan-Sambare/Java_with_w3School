package com.objectorientation;

public class ParentApp2 {

	public static void main(String[] args) {
		Child c= new Child();
//		System.out.println(c.a);
//		System.out.println(c.b);
	}

}
class parent{
	int a;
	int b;
	public parent() {
	a=55;
	b=555;
}

public parent(int a,int b) {
	this();
	this.a=a;
	this.b=b;

}
class Child extends parent {
		public Child() {
			super(30,40);
		
			a=30;
			b=40;
		}
		public Child(int a,int b) {
			this();
			this.a=a;
			this.b=b;
		}
}
}