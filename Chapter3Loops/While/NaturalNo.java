package While;
//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class NaturalNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=0;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}