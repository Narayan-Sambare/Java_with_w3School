/*
2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class SubArraySumIs0
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={-1, 0, 1, 2, -1, -4};
		int k=2;
		int sum=0;
		for(int i=0;i<a.length-k;i++)
		{
			
			for(int j=i;i<(i+k);j++)
			{
				sum=sum+a[j];
				if(sum==0)
				{
					System.out.print(a[j]+" ");
					break;
				}
			}
		}
	}
}