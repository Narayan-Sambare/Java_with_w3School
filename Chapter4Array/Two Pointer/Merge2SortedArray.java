//Q4. Merge Two Sorted Arrays (No Extra Space)
//Merge two sorted arrays in-place using the two-pointer method

import java.util.*;
public class Merge2SortedArray
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of 1st array");
        int aidx=sc.nextInt();
        System.out.println("enter size of 2nd array");
        int bidx=sc.nextInt();
        int a[]=new int[aidx];
        int b[]=new int[bidx];
        int c[]=new int[a.length+b.length];
	
		
        System.out.print("Enter "+aidx+" element for 1st Array \n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        System.out.print("Enter "+bidx+" element for 2st Array \n");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
	
		Arrays.sort(a);//Array sortting
		Arrays.sort(b);//Array sortting        
		if(a.length<b.length)
		{
			for(int i=0; i<b.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			c[i+a.length]=b[i];
		}
		}
		else{
			for(int i=0; i<a.length; i++)
			{
			if(i<b.length)
			{
				c[i]=a[i];
			}
			c[i+a.length]=b[i];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+", ");
		}
    }
}