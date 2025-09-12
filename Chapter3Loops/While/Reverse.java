package While;
//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class Reverse
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int n=123;
		int rev=0;
		while(n>0)
		{
			int temp=n%10;
			n=n/10;
			rev=rev*10+temp;
		}
		System.out.println(rev);
	}
}
		