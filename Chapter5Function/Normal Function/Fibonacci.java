/*
Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
Example: Input 5 → 0 1 1 2 3.
*/

import java.util.*;
public class Fibonacci
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		printFibonacci(n);
	}
	public static void printFibonacci(int a)
	{
		int f1=0;
		int f2=1;
		if(a==1)
		{
			System.out.println(f1);
		}
		else if(a==2)
		{
		System.out.println(f1+" "+f2);
		}
		else
		{
			int i=3;
			System.out.print(f1+" "+f2+" ");
			while(i<=a)
			{
				int sum=f1+f2;
				f1=f2;
				f2=sum;
			
				System.out.print(sum+" ");
				i++;
			}
		}
			
		
		
	}
	
}