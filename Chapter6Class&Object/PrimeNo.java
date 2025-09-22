// 14. Check for Prime Numbers
// Create a class PrimeChecker with a method isPrime to check if a number is prime.
// Explanation: Introduces number theory logic.

import java.util.*;
public class PrimeNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        PrimeChecker p=new PrimeChecker();
        boolean f = p.isPrime(n);
        if(f)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }

        }
    }

class PrimeChecker
{
       
    boolean isPrime(int n)
    {
        int i=2;
        
        while(n>i)
        {   
            if(n%i==0)
            {
                 return false;
            }
            i++;   
        }
        return true;
    }
}