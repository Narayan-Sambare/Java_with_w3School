//Q5. Write a java program to find positive and negative number in array.

import java.util.Scanner;
public class FindPosNegNu
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Positive numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{	
			System.out.println(a[i]);
			}
		}
			System.out.println("negative numbers");

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
		
		