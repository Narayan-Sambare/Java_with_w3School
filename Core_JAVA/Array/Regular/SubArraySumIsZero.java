/*
2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class SubArraySumIsZero
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]={-1, 0, 1, 2, -1, -4};
		int k=2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int c=j+1;c<a.length;c++)
				{
					if(a[i]+a[j]+a[c]==0)
						{
							System.out.print("("+a[i]+" "+a[j]+" "+a[c]+")"+"\t");
						}
				}
			}
		}
		
	}
}