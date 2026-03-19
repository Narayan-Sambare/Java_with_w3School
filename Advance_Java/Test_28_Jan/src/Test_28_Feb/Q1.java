package Test_28_Feb;

import java.util.*;

//Q1. Write a java program to check Number Is Armstrong Number or Not Armstrong using
//function recursion

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : "
				+ "");
		int n = sc.nextInt(); // user input
		int count = count(n);
		boolean result = isArmstrong(n, n, 0);// check Armstrom function call
		if (result) {
			System.out.print(" Armstrong Numbers ");
		} else {
			System.out.print("Not Armstrong Numbers ");
		}
	}

	
	//armstrong function logic
	static boolean isArmstrong(int org, int n, int sum) {

		int temp = n % 10;
		int c = count(org); //count digit function call
		int fact = fact(temp, c); // foctor function call
		if (n == 0) {
			if (sum == org) {
				return true;
			} else {
				return false;
			}
		}
		return isArmstrong(org, n / 10, sum + fact); // recurtion call
	}

	// factor logic
	static int fact(int n, int c) {
		int fact = 1;
		for (int i = 0; i < c; i++) {
			fact *= n;
		}
		return fact;
	}

	// digit count logic 
	static int count(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n /= 10;
		}
		return c;
	}

}
