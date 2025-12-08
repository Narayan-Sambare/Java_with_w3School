/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
import java.util.*;
public class CheckEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		NumberChecker c= new NumberChecker();
		System.out.println("Enter the number");
		int n=sc.nextInt();
		c.isEven(n);
	}
}
class NumberChecker 
{
	void isEven(int n)
	{
		if(n%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}