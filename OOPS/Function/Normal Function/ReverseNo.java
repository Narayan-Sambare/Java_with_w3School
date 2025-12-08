/*
Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/
import java.util.*;
public class ReverseNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Reverse No -->"+reverseNumber(n));
	}
	public static int reverseNumber(int a)
	{
		int result=0;
		while(a>0)
		{
			int rem=a%10;
			a=a/10;
			result=(result*10)+rem;
		}
		return result;
	}
	
}