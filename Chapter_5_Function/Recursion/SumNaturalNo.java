//Write a program to find the sum of first n natural numbers using recursion.

import java .util.*;
public class SumNaturalNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int range=sc.nextInt();
		
		int a=sumNatural(range,0);
		System.out.println("sum of natural number :"+a);
	}

	
	 public static int sumNatural(int range, int result)
	 {
		if(0==range)
		{
			return result;
		}else
		{	result+=range;
			return sumNatural(--range,result);
		}	
	}
}