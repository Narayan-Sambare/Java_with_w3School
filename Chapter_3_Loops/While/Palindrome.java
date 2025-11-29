package While;
//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
			System.out.println(rev);
			n=temp;
			if(rev==n)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not palindrome");
			}
	}
}
			
			