//19. Write a program to find the sum of factorials from 1 to n using recursion

import java .util.*;
public class SumOfFactorials1_N
{	int i=1;
	int fact=1;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();	//10
		SumOfFactorials1_N s=new SumOfFactorials1_N();
		
		s.factorial(n);
		int result=s.sum(n,fact);
		System.out.println(a);
	}
	
	 public int factorial(int n)
	 {
		if(n==0)
		{
			return s.sum(fact);
			//return fact;	
		}
		else{
			fact*=n;
			return  factorial(--n);
		}
	 }
	 public int sum(int fact)
	 {
		 if(n==0)
		 {
			 return sum;
		 }
		 else{
			 sum+=fact;
			 return s.factorial(--n);
			 //return sum(fact);
		 }
	 }
	 
}