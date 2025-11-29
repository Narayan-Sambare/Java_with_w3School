package While;
//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class CheckPrime
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1	;
		if(n==1||n==0)
		{
			System.out.println("not prime not composite");
		}
		while(i<n)
		{
			i++;
			if(n%i!=0 || n==2)
			{
				System.out.println("prime number");	
				break;
			}	
			else
			{
				System.out.println(" not prime number");
				break;
			}
		}
	}
}