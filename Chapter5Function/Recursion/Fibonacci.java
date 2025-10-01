//Q5 Write a program to print the first n Fibonacci numbers using recursion.

import java.util.*;
public class Fibonacci
{	static int f1=0,f2=1;
    
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		fib(n,0);
	}

	
	 public static int fib(int n,int sum)
	 {	
		if(n==0)
		{
			return sum;
		}
		else
		{	sum=f1+f2;
			System.out.print(f1+" ");
			f1=f2;
			f2=sum;
			
			return fib(--n,sum);
		}
	 }
}