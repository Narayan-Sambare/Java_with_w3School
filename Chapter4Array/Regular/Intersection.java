// 7. Find Intersection of Two Arrays
//  Problem:
// Print common elements in two arrays using brute force.
// Example:
// Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
// Output: 2, 3

import java.util.*;
public class Intersection
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        System.out.print("<---1 st array -->\nEnter "+n+" Array element\n");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("<---2st array -->\nEnter "+n+"Array element\n");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++)
        {
             for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                     System.out.print(arr1[i]+",");
                }
            }
        }
      

        
    }
}