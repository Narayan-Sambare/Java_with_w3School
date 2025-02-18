package com.objectorientation;

public class studentapp {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.eat();
		s1.sleep();
		s1.name="khushal";
		s1.age=21;
		s1.gender="male";
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);
		
		Student s2=new Student();
		s2.eat();
		s2.sleep();
		s2.name="sanket";
		s2.age=22;
		s2.gender="male";
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.gender);
		
		Student s3=new Student();
		s3.eat();
		s3.sleep();
		s3.name="khushal";
		s3.age=21;
		s3.gender="male";
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.gender);
		
		
	}

}
class Student{
	String name;
	int age;
	String gender;
	
	void eat() {
		System.out.println("student is eating");
	}
	void sleep() {
		System.out.println("student is sleeping");
	}

}