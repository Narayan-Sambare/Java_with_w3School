//Q10 Write a program to count the number of digits in a given number using recursion.

import java .util.*;
public class CountOfDigit
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		
		int result=digitcount(n,count);
		System.out.println("number of digit :"+result);
	}

	
	 public static int digitcount(int n,int count)
	 {		if(n==0)
			 {
				 return count;
			 }else
			 {
				return digitcount(n/10,++count);
			 }
		
	 }
}