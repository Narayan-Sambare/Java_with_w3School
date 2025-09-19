//Q14. Write a function to find the sum of first n natural numbers.

import java.util.*;
public class SumOfNaturalN
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n terms");
        int n=sc.nextInt();
       System.out.println("Sum of natural number : "+ naturalNo(n));
    }
    public static int naturalNo(int n)
    {
           int sum=0;
           for(int i=1;i<=n;i++)
           {
            sum=sum+i;
           }
       return sum; 
    }
}