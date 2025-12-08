// Q9. Write a program in java to count all distinct pairs for a specific difference
// Expected Output:
//  The given array is:
//  5 2 3 7 6 4 9 8
//  The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
//  Number of distinct pairs for difference 5 are: 3

import java.util.*;
public class FindPairsUsingDiff
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter difference");
        int d=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
             for(int j=0;j<a.length;j++)
            {
                if(a[i]-a[j]==d)
                {
                     System.out.println("("+a[i]+","+a[j]+")");
                    count++;
                }
            }
        }
        System.out.println("Number of distinct pairs for difference "+d+" are--> "+count);
    }
}