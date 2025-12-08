/*
Write a program to calculate the factorial of a given number using recursion.
*/
import java .util.*;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n; 
		
		int a=findFactorial(n,1);
		System.out.println(a);
	}

	
	 public static int findFactorial(int n, int f)
	 {
		 		 
		 if(n==1)
		 {
			 return f;
		 }
		 else
		 {		f=f*n;
			return findFactorial(--n,f);
		 }
		
	 }
}