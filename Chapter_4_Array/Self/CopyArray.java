//Q13. Write a java program to copy one array to another array.

import java.util.*;
public class CopyArray
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
		int b[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<a.length;i++)//take input
        {
            a[i]=sc.nextInt();
        }
		for(int i=0;i<a.length;i++)//display array
        {
			b[i]=a[i];
			System.out.println("a[" +i+"]="+a[i]+"\t\t\t b[" +i+"]="+b[i]);
        }
        
    }
}