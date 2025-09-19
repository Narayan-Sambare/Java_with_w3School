//Q2.Write a function to find the sum of digits of a given number.

import java.util.*;
public class SumOfDigit
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=digitSum(n);
        System.out.println("Sum of digit : "+sum);
    }
    public static int digitSum(int n)
    {   int sum=0;
        while(n>0)
        {
            
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
