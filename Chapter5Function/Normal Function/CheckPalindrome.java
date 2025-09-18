/*
Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.
*/

import java .util.*;
public class CheckPalindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isPalindrome(n);
	}
	public static void isPalindrome(int a)
	{	int rev=0;
		int i=a;
		while(i>0)
		{
			int rem=i%10;
			i=i/10;
			rev=rev*10+rem;
		}
		if(rev==a)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}