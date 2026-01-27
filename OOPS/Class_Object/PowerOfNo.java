// 13. Find Power of a Number
// Create a class PowerCalculator with a method power that calculates base raised to an exponent.
// Explanation: Demonstrates looping or recursion.

import java.util.*;
public class PowerOfNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("Enter the base :");
        int b=sc.nextInt();

        PowerCalculator pow=new PowerCalculator();
        int p=pow.power(n,b);
        System.out.println("Power of "+n+ " with base of "+b+" is :"+p);
    }
}
class PowerCalculator
{
    int power(int n,int b)
    {   int i=1;
        int pow=1;
        while(i<=b)
        {
            pow*=n;
            i++;
        }
        return pow;
    }
}