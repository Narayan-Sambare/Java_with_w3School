//Q18. Write a java program to remove duplicated values of arrays.

import java.util.*;
public class RemoveDupValue
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<a.length;i++)//take input
        {
            a[i]=sc.nextInt();
        }
		Arrays.sort(a);
		int count=0;
		System.out.println("<Sorted array is -->");
		for(int i=0;i<a.length;i++)//display array
        {
			System.out.println("a[" +i+"]="+a[i]);
        }
		//1 1 1 2 2 3 3 5;
		int j=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[j]!=a[i])
			{   count++;
				j++;
				a[j]=a[i];
			}
		}
		System.out.println("<new array size is -->"+(count+1));
		for(int i=0;i<=count;i++)//display new array
        {
			System.out.println("a[" +i+"]="+a[i]);
        }
		
        
    }
}