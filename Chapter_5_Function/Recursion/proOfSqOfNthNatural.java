// 21. Write a program to find the pro of squares of first n natural numbers using recursion.

import java .util.*;
public class ProOfSqOfNthNatural
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int pro=1;
		
		int result=sqPro(n,pro);
		System.out.println("product of Square of nth natural number :"+result);
	}

	
	 public static int sqPro(int n,int pro)
	 {		if(n==0)
			 {
				 return pro;
			 }else
			 {  if(n%2==0)
				 {pro*=n*n;
				 }
				return sqPro(--n,pro);
			 }
	 }
}