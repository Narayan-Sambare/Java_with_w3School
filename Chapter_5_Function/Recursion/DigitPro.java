//Q13 Write a program to find the product of digits of a given number using recursion.

import java .util.*;
public class DigitPro
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int pro=1;
		
		int result=digitPro(n,pro);
		System.out.println("product of digit :"+result);
	}

	
	 public static int digitPro(int n,int pro)
	 {		if(n==0)
			 {
				 return pro;
			 }else
			 {
				return digitPro(n/10,pro*=(n%10));
			 }
	 }
}