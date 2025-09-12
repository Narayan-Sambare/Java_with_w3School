package For_Loop;
//Q17. Write a java program to find all factors of a number.

import java.util.*;
public class Factor
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		for(int i=1;i<n;n--)
		{
			f=f*n;
		}
		System.out.println(f);
	}
}
			