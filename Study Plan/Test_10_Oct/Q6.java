/*
 Q6. Write a Java program to find the kth highest value from an integer array using unsorted
array.
Example :
Input: Array : [15, 8, 22, 4, 10, 18] 
k = 2
Output : 2nd highest value = 18
 */

import java .util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int as=sc.nextInt();
		int a[]=new int[as];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+" element in array :");
			a[i]=sc.nextInt();
		}
		System.out.println("k position");
		int k=sc.nextInt();
		
		int result=kthHigh(a,k);
		System.out.println(k+" Highest value is :"+result);
	}

	
	 public static int kthHigh(int n[],int k)
	 {  int h=0;
		int tem[]=n;
		int maxI=0;
		int maxh=Integer.MIN_VALUE;
		for(int i=1;i<=k;i++)
		{   maxh=Integer.MIN_VALUE;
			for(int j=0;j<tem.length;j++)
			{
				if(tem[j]>maxh)
				{
					maxh=tem[j];
					maxI=j;
				}
			}
			tem[maxI]=-1;
			
		}

		return maxh;
	 }
}