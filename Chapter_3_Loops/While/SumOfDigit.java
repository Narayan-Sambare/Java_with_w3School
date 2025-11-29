//Q11. Write a java program to calculate the sum of digits of a number.

import java.util.*;
public class SumOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int temp=0,sum=0;
		while(n>0)
		{
			temp=n%10;
			n=n/10;
			sum=sum+temp;
		}
	System.out.println(sum);
	}
}
			
