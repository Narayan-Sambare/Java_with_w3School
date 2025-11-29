package While;
//Q12. Write a java program to calculate the product of digits of a number

import java.util.*;
public class ProductOfDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		int p=1,temp=1;
		while(n>0)
		{
			temp =n%10;
			n=n/10;
			p=p*temp;
		}
		System.out.println(p);
	}
}