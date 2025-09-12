//Q19. Write a java program to find the prime number of an array

import java.util.*;
public class FindPrimeNo
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
		//1 2 3 5 7 8 9 n=8
		for(int i=0;i<a.length;i++)
        {     int count=0;
			for(int j=2;j<i;j++)
			{ if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{	if(a[i]==1)
				{
					continue;
				}
				System.out.print(a[i]+" ");
			}
        }
        
    }
}