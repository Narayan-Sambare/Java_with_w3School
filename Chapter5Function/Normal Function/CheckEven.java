/*
Q2. Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/
import java.util.*;
public class CheckEven
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		isEven(n);
	}
	public static void isEven(int a)
	{
		if(a%2==0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.print("false");
		}
	}
}
