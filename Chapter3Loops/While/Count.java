package While;
//Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class Count
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in); 
			System.out.println("Enter the Number");
			int n=sc.nextInt();
			
			
			int count=0;
			
			while(n>0)
			{
				n=n/10;
				count++;
			}
			System.out.println(count);
	}
}