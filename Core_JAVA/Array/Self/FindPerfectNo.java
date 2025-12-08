//Q20. Write a java program to find the perfect number of an array
import java.util.*;
public class FindPerfectNo
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
		int i=0;//1 2 3 6 28 n=5;
		int j,sum;
		while(i<a.length)
		{    j=1;
			 sum=0;
			 // System.out.println("\n"+a[i]+" : ");
			while(j<=(a[i]/2)
			{
				if(a[i]%j==0)
				{
					// System.out.print(j+" ");
					sum=sum+j;
				}
				j++;
			}
			
			if(sum==a[i]){
			System.out.println(a[i]);
			}
			i++;
		}	
			
        
    }
}	