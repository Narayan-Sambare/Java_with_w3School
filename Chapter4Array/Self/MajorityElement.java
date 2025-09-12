//Q17.  Write a java program to check majority element of array

import java.util.*;
public class MajorityElement
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
		
		int sum=Integer.MIN_VALUE;
		int newn=0;
		for(int i=0;i<a.length;i++)
        {	int count=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>sum)
			{
				sum=count;
				newn=a[i];
			}
        }
		System.out.println(newn+"---> "+sum);
        
    }
}