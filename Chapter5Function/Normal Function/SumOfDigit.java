/*
Sum of Digits


Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.


Example: Input 123 → Output: 6.
*/

import java.util.*;
public class SumOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of digitsis -->"+sumOfDigits(n));
	}
	public static int sumOfDigits(int a)
	{
		int result=0;
		while(a>0)
		{
			int rem=a%10;
			a=a/10;
			result=result+rem;
		}
		return result;
	}
	
}