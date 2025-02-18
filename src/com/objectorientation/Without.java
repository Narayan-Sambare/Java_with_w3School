package com.objectorientation;
import java.util.Scanner;
public class Without{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println("a="+a+"  b="+b);
		 a=a+b;//30
		 b=a-b;//10
		 a=a-b;//20
		
		System.out.println("after swapping");

		System.out.println("a="+a+"  b="+b);

	}

}
