/*
Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/

import java.util.*;
public class DeleteValue
{	public static void main(String x[])
    {	Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<n;i++)//take input
        {
          a[i]=sc.nextInt();
        }
		System.out.println("enter index number for delete value");
        int idx=sc.nextInt();
		
		 for(int i=idx;i<a.length-1;i++)
        {
           a[i]=a[i+1];
        }
		System.out.println("display array");
		 for(int i=0;i<n-1;i++)
        {
            System.out.println("a[" +i+"]="+a[i]);
        }
        
    }
}