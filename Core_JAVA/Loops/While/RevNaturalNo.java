//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class RevNaturalNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			System.out.println(n);
			n--;
		}
		
		
	}
}
	