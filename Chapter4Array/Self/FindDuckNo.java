//Q21. Write a java program to find the duck number of an array.

import java.util.*;
public class FindDuckNo
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
		int i=0;//1 2 20 30 4 n=5
		while(i<a.length)
		{
			int c=a[i];
			while(0<c)
			{
				int rem=c%10;
				c=c/10;
				if(rem==0)
				{
					System.out.println(a[i]+" ");
					break;
				}
				
			}
			
			i++;
		}
        
    }
}