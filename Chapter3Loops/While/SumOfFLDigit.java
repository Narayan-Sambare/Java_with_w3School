//Q19. Write a java program to find the sum of the first and last digit of a number.


import java.util.*;
public class SumOfFLDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		int last=n%10;
		int temp=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int a=(int)Math.pow(10,count-1);
		int first=temp/a;
		int sum=first+last;
		System.out.println("first number-->"+first);
		System.out.println("last number-->"+last);
		System.out.println("Sum="+sum);
	}
}
		