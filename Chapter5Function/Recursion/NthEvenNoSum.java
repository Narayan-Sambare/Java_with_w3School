//Q15 Write a sumgram to find the sum of even numbers up to n using recursion.

import java .util.*;
public class NthEvenNoSum
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		
		int result=evenSum(n,sum);
		System.out.println("sumduct of nth even number :"+result);
	}

	
	 public static int evenSum(int n,int sum)
	 {		if(n==0)
			 {
				 return sum;
			 }else
			 {  if(n%2==0)
				 {sum+=n;
				 }
				return evenSum(--n,sum);
			 }
	 }
}