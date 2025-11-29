/*
3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2] , k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/

import java.util.*;
public class PairsWithDiffK
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={1, 5, 3, 4, 2};
		System.out.print("Enter k :");
		int k=sc.nextInt();
		// Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			  
			for(int j=0;j<a.length;j++)
			{
				//  System.out.println(a[i]+"\t"+a[j]);
				if(Math.abs(a[i]-a[j])==k)
				{
					
					System.out.print("("+a[i]+","+a[j]+")");
				}
			}
			
		}
	}
}	
		