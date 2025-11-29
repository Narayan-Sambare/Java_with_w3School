//Q9 Write a program to calculate the sum of digits of a given number using recursion.


import java .util.*;
public class SumOfDigit
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		int result=digitSum(n,sum);
		System.out.println("sum of digit :"+result);
	}

	
	 public static int digitSum(int n,int sum)
	 {		if(n==0)
			 {
				 return sum;
			 }else
			 {
				return digitSum(n/10,sum+=(n%10));
			 }
		
	 }
}