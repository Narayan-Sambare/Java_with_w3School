package com.objectorientation;
import java.util.Scanner;
public class StudentSecurity {
Scanner sc=new Scanner(System.in);

class student{
	private String name;
	private int age;
	public void setData(String n , int a) {
		name=n;
		age=a;
	}
	public String getname(){
		return name;
	}
	public int getage() {
		return age;
	} 
	}

class StudentApp{
	public static void main(String [] args) {
		student s=new student();
		s.setData("sanket",22);
//		s.getname();
//		s.getage();
		System.out.println();
		System.out.println();
	}
	
}
}
    