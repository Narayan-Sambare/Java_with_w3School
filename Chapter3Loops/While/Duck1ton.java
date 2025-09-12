package While;
/*
Q32. Write a java program to display 1 to nth Duck Number.
*/

import java.util.*;
public class Duck1ton
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=i;
			while(j>0)
			{
				int rem=j%10;
				 j=j/10;
				if(rem==0)
				{
					System.out.println(i);
					break;
				}
					
			}
			
			i++;
		}
	}
}

