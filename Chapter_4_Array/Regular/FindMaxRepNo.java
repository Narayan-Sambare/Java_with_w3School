// Q10. Write a program in java to find the maximum repeating number in a given array.
// The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
//  Expected Output:
//  The given array is:
//  2 3 3 5 3 4 1 7 7 7 7
//  The maximum repeating number is: 7

import java.util.*;
public class FindMaxRepNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        int num=0;
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=0,count,v;

         for(int i=0;i<a.length;i++)
        {
            count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(max<count)
            {
                max=count;
                num=a[i];
            }
        }
        
        System.out.print("maximum repeating number-->"+num);
    }
}