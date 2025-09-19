// Q1.Write a function to check whether a number is prime or not.

import java.util.*;
public class CheckPrime
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        isPrime(n);

    }
    public static void isPrime(int n)
    {
        int count=0;
        int i=2;
        while(i<n)
        {   
            if(n%i==0)
            {
                count++;
                break;
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("prime");
        }else
        {
            System.out.println("not prime");
        }
    }    
}
