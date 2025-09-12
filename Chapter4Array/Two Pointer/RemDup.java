//Q5. Remove Duplicates from Sorted Array
//Remove duplicates from a sorted array using two pointers and return new length.

import java.util.*;
public class RemDup
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
		for(int i=0;i<a.length;i++)//display array
        {
			 if(a[i]==a[i+1])
			 {
				 for(int j=i+1;j<a.length;j++)
				 {
					 a[j]=a[j+2];
				 }
			 }
        }
        for(int i=0;i<a.length;i++)//display array
        {
			System.out.println("a[" +i+"]="+a[i]);
        }
    }
}