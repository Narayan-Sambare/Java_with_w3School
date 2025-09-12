package While;
//Q20. Write a java program to swap first and last digits of a number.

import java.util.*;
public class FLSwap
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();//1234
		int t=n;
		int count=0;
		while(t>0)
		{
			t=t/10;
			count++;
		}
		int a=(int)Math.pow(10,count-1);
		int last=n%10;//4
		int first=n/a;//1
		int c=first*a;//1000
		int mid=n-c;//1234-1000=234
		mid=(mid/10)*10;//230
		int newn=last*a+mid+first;
		System.out.println("first-->"+first);//1
		System.out.println("last-->"+last);//4
		System.out.println("mid-->"+mid);//230
		System.out.println(newn);
		
	}
}