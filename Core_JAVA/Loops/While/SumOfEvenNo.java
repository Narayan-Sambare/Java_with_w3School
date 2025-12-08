//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class SumOfEvenNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			while(i%2==0)
			{
				sum=sum+i;
				System.out.print(i+" + ");	
					break;
			}
			i++;
		}
		System.out.println("="+sum);
		
	}
}
				
				