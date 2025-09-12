/*
1. Find the Maximum Sub array Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1, -3,   4,  -1,  2,  1,  -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class MaxSumOfSubArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={-2, 1, -3,   4,  -1,  2,  1,  -5,  4};
		int k=3,max=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			max= Integer.MIN_VALUE;
			for(int j=i;i<(i+k);i++)
			{
				sum=sum+a[j];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}
}