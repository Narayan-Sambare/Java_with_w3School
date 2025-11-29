/*Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/

import java.util.*;
public class FindMissingValue
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
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<=max;i++)
        {
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{	
					flag=true;
					break;
				}
				else
				{
					flag=false;
					
				}			
			}
			if(!flag)
			{
				System.out.println(i);
			}
		}
	}
}