// Q8. Write a program in java to count the number of inversion in a given array
// Expected Output :
//  The given array is : 1 9 6 4 5
//  The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
//  The number of inversion can be formed from the array is: 5

import java.util.*;
public class CountInversionNo
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
        for(int i=0;i<a.length;i++)
        {
             for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }

       
    }
}