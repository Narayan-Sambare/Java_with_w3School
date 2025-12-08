// Q16. Write a function to find the sum of cubes of first n natural numbers.

import java.util.*;

public class CubOfNaturalNo
{public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n terms");
        int n=sc.nextInt();
       System.out.println("sum of Cubes of natural number : "+ cubeNaturalNo(n));
    }
    public static int cubeNaturalNo(int n)
    {
           int sum=0;
           for(int i=1;i<=n;i++)
           {
            sum=sum+(i*i*i);
           }
       return sum; 
    }
}