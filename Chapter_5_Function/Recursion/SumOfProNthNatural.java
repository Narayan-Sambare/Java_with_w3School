// 17. Write a sumgram to find the sum of squares of first n natural numbers using recursion.

import java .util.*;
public class sumOfSqNthNatural
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		int result=proSum(n,sum);
		System.out.println("sum of product of nth natural number :"+result);
	}

	
	 public static int proSum(int n,int sum)
	 {		if(n==0)
			 {
				 return sum;
			 }else
			 {  if(n%2==0)
				 {sum+=n*n;
				 }
				return proSum(--n,sum);
			 }
	 }
}