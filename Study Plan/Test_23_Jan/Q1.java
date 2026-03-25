//Q1. Write a java program to print 1 to nth Strong number. 

package test;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last (Nth) number : ");
		int n=sc.nextInt();
//		int n=145;
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			temp=i;
			int sum=0;
			
			while(temp>0)
			{
				int rem=temp%10;
				int fact=rem--;
				while(rem>0)
				{
					fact=fact*rem;
					rem--;
				}
				sum=sum+fact;
				temp=temp/10;
			}
			
			if(sum==i)
			{
				System.out.println(i);
			}
			
		}

	}

}
