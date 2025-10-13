// Q7 Write a java program to find the unique value from array.
// Input array elements: 1, 2, 3, 5, 1, 5, 20, 2, 12, 10
// All unique elements in the array are: 3, 20, 12, 10

import java .util.*;
public class Q7
{
	public static void main(String x[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int as=sc.nextInt();
		int a[]=new int[as];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the a["+i+"] element in array :");
			a[i]=sc.nextInt();
		}

		unique(a);
	}

	
	public static void unique(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean f=false;
			int j=0;
			while(j<a.length)
			{
				if(j!=i && a[i]==a[j])
				{
					f=true;
					break;
				}
                j++;
			}
            
			if(!f)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
}