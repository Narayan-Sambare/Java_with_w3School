/*
Q8. Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().
*/
import java.util.*;
public class SmallestElementInArray
{
	public static void main(String x[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("enter the "+n+" values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("smallest element in array -->"+FindMin(a));
	}
	public static int FindMin(int a[])
	{	
		Arrays.sort(a);
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		return small;
	}
}