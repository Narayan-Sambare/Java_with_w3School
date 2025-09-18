// Q4.Write a program to check whether a given number is a palindrome using recursion.

import java .util.*;
public class CheckPalindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int rev=0;
		int a=isPalindrome(n,rev);
		System.out.println("rev : "+n);
		System.out.println("num :"+num);
		
 		if(a==num)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
	}

	
	 public static int isPalindrome(int n,int rev)
	 {
		if(n==0)
		{
			return rev;
		}

		int temp =n%10;
		rev=rev*10+temp;
		return isPalindrome(n/10, rev);
		
	 }
}