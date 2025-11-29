package While;
//Q18. Write a java program to find the first and last digit of a number.

import java.util.*;
class FLDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(n>0)	
		{
			n=n/10;
			count++;
			
		}
		int last=temp%10;
		int a =(int)Math.pow(10, count-1);
		System.out.println("a-->"+a);
		int first=temp/a;
		System.out.println("first number "+first);
		System.out.println("last number "+last);


	}
}