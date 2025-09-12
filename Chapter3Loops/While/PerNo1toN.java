package While;
/*
Q31. Write a java program to display 1 to nth Perfect Number.
*/
//6= 1+2+3
import java.util.*;
public class PerNo1toN
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{		int j=1;
				int sum=0;
			while(j<i)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
				j++;
			}
			if(sum==i)
				{
					System.out.println(i);
				}
				i++;
		}
	}
}
	
	
	