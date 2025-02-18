package com.objectorientation;
import java.util.Scanner;
public class practic {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		String firstName = "John ";
//		String lastName = "Doe";
//		System.out.println(firstName.concat(lastName));
//		String san = "We are the so-called \"Vikings\" from the north.";
//		String san1 = "It\'s alright.";
//		String san2 = "The character \\ is called backslash.";
//		System.out.println(san);
//		System.out.println(san1);
//		System.out.println(san2);
//		String san3 = "We are the so-called \"Vikings\" from the north.";
//		System.out.println(san3);
//		System.out.println(Math.sqrt(64));
//		System.out.println(Math.min(5, 10));
//		System.out.println(Math.abs(-4.7));
//		int randomNum = (int)(Math.random() * 101);
//		System.out.println(randomNum);
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
//		System.out.println(isJavaFun);     
//		System.out.println(isFishTasty);
//		int x=10;
//		int y=9;
//		System.out.println(x > y);
//		System.out.println(10 > 9);
//		int x = 10;
//		System.out.println(x == 10);
//		int myAge = 25;
//		int votingAge = 18;
//		System.out.println(myAge >= votingAge);
//		9011...
//		System.out.println("Enter your age");
//		int myAge=sc.nextInt();
//		System.out.println("Enter 20Voting age ");
//		int votingAge=sc.nextInt();
//		
//
//		if (myAge >= votingAge) {
//		  System.out.println("Old enough to vote!");
//		} else {
//		  System.out.println("Not old enough to vote.");
//		}
		int dice = 1;

		while (dice <= 6) {
		  if (dice < 6) {
		    System.out.println("No Yatzy.");
		  } else {
		    System.out.println("Yatzy!");
		  }
		  dice = dice + 1;
		}
	
	}

}
