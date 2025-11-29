//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
public class Tables
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int table=i*n;
			System.out.println(i+" * "+n+" = "+table);
		}
	}
}