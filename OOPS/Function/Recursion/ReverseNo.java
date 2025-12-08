//Q11 Write a program to reverse a given number using recursion.

import java .util.*;
public class ReverseNo
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		
		int result=digitRev(n,rev);
		System.out.println("reverse number :"+result);
	}

	
	 public static int digitRev(int n,int rev)
	 {		if(n==0)
			 {
				 return rev;
			 }else
			 {	rev=rev*10+(n%10);
				return digitRev(n/10,rev);
			 }
		
	 }
}