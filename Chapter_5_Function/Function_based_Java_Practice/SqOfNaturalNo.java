//Q15. Write a function to find the sum of squares of first n natural numbers.

import java.util.*;

public class SqOfNaturalNo
{public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n terms");
        int n=sc.nextInt();
       System.out.println("sum of Square of natural number : "+ sqNaturalNo(n));
    }
    public static int sqNaturalNo(int n)
    {
           int sum=0;
           for(int i=1;i<=n;i++)
           {
            sum=sum+(i*i);
           }
       return sum; 
    }
}