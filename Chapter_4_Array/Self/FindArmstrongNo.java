//Q23. Write a java program to find the armstrong number of an array. 

import java.util.*;
public class FindArmstrongNo
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
		//1 6 153 370 5 n=5
		int fact=0,rem=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("<------------------------->");
			int c=a[i];
			rem=0;
			int count=0;
			System.out.println("c--->"+c);
			while(c>0)
			{
				c=c/10;
				count++;
			System.out.println("count--->"+count);
			}
			c=a[i];
			
			while(0<c)
			{
				rem=c%10;
				c=c/10;
				int b=(int)Math.pow(rem,count);
				System.out.println("b--->"+b);
					fact=fact+b;
			}
			System.out.print("fact-->"+fact);
			System.out.println("a[i]-->"+a[i]);
			if(fact==a[i])
				{
					System.out.println(a[i]+" ");
				}
			
		}
        
    }
}