/*
Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/
import java.util.*;
public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.println(result);
		
	}
	public static int factorial(int a)
	{  int f=1; 
		for(int i=a;i>0;i--)
		{
			f=f*i;
		}
		return f;
			
	}
}
	