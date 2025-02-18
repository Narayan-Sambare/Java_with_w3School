package com.objectorientation;

import java.util.Scanner;

public class userform {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please Enter Your Name");
		String name=sc.nextLine();
		 
		
		System.out.println("Please Enter Your Age");
		int age=sc.nextInt();
		 
		sc.nextLine();
		System.out.println("Please Enter Your Gender");
		String gender=sc.nextLine();
		
		System.out.println("Please Enter Your Contact Number");
		int contact=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Please Enter Your Email");
		String email=sc.nextLine();
		
		System.out.println("Please Enter Your Mobile Number");
		String mobile=sc.nextLine();
		
		System.out.println("Please Enter Your Roll Number");
		byte roll=sc.nextByte();
		
		sc.nextLine();
		System.out.println("Please Enter Your Password");
		String password=sc.nextLine();
		
		System.out.println("Name:-"+name);
		System.out.println("Name:-"+age);
		System.out.println("Name:-"+gender);
		System.out.println("Name:-"+contact);
		System.out.println("Name:-"+email);
		System.out.println("Name:-"+mobile);
		System.out.println("Name:-"+roll);
		System.out.println("Name:-"+password);
		
		

	}

}
