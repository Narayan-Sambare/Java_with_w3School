/*
Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/
import java.util.*;
public class CheckPrime
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		do
		{	System.out.println("Enter 1 for check number is prime");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.println("Enter the number");
				int n=sc.nextInt();
				IsPrime(n);
				break;
				
				default :
				return ;
				
			}
		}while(true);
	}
	public static void IsPrime(int a)
	{ 	
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			count++;
			}
		}
		if(count==0)
		{
			System.out.println(a+" is prime");
		}
		else
		{
			System.out.println(a+" is not prime");
		}
	}		
}
