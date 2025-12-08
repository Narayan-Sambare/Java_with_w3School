package While;
/* Q22. Write a java program to Check Number Is Perfect Number or Not.
 6 is perfect number
	6%1=0,6%2=0,6%3=0
	1+2+3=6
	deviser sum and the given number is same then this number is perfect number 
*/

import java.util.*;

public class  PerNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1,num=0;
		while(i<n-1)
		{
			if(n%i==0)
			{
				num=num+i;
			}
			i++;
		}
		if(num==n)
		{
			System.out.println("Perfect number");
		}
		else
			System.out.println("not perfect number");
	}
}			
			