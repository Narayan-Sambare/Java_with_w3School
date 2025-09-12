//Q22. Write a java program to find a strong number of an array.
//1, 2, 145 this is strong number the sum of factor of each number==number
//1!+4!+5!==145

import java.util.*;
public class FindStrongNo
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
		//1,2,40585,145,5 n=5
		int fact=1,sum=0,rem=0;
		for(int i=0;i<a.length;i++)
		{
			int c=a[i];
			rem=0;
			
			sum=0;
			while(0<c)
			{
				rem=c%10;
				c=c/10;
					fact=1;
				while(rem>0)//find factor
				{
					fact=fact*rem;
					rem--;
				}
				sum=sum+fact;//sum the factor
			}
			if(sum==a[i])
				{
					System.out.println(a[i]+" ");
				}
			
		}
        
    }
}