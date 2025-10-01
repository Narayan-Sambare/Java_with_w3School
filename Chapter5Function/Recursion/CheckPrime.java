//Q12 Write a program to check whether a given number is prime using recursion.

import java .util.*;
public class CheckPrime
{	static int count=0;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		CheckPrime s=new CheckPrime();
		int result=s.isPrime(n,i);
		if(count==1)
		{
			System.out.println("Prime");
		}else{
			System.out.println("not Prime");
		}
	}

	
	 public int isPrime(int n,int i)
	 {		 
			if(n==i)
			 {
				 return count;
			 }else
			 {	if(n%i==0)
				 {
					 count++;
				 }
				return isPrime(n,++i);
			 }
		
	 }
}