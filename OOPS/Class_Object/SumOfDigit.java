// 17. Calculate Sum of Digits
// Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
// Explanation: Practices loops for digit extraction.

import java.util.*;
public class SumOfDigit
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        DigitSumCalculator c1=new DigitSumCalculator();
        int sum=c1.method1(n);
        System.out.println("sum of digit :"+sum);
    }
}
class DigitSumCalculator
{
    int method1(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }    
        return sum;
    }

}