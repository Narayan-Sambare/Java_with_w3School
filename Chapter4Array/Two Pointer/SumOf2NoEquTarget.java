//Q1. Sum of Two Numbers Equals Target
//Given a sorted array and a target, check if there are two numbers that sum up to the target.

import java.util.*;
public class SumOf2NoEquTarget
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
		  
		System.out.println("Enter target number");
		int target=sc.nextInt();
		
        System.out.print("Enter "+n+" Array element\n");//target=4 -- 1 2 3 2 1 -- n=5
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		Arrays.sort(a);//Array sortting
		/* 
        int L=0,R=a.length-1;
		 System.out.println();
		 while(L<a.length)
		 { 
			 int sum=a[L]+a[R];
			 if(sum==target)
			 {
				 System.out.println(a[L]+" "+a[R]);				 
			 }
              R--;			 
                if(L>=R)
				{
					R=a.length-1;//reset to last element
					L++; //
				}			
		 }
        */
		for(int i=0, k=a.length-1;k>i;)
		{
			if(a[i]+a[k]==target)
			{
				System.out.print("("+a[i]+","+a[k]+") ");
			}
			k--;
			if(i>=k)
			{
				k=a.length-1;	//reset to last element
				i++;
			}
		}
    }
}