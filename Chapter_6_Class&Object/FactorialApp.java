// 12. Find Factorial of a Number
// Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
// Explanation: Focuses on iterative or recursive logic.

import java.util.*;
public class FactorialApp
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        FactorialCalculator fact=new FactorialCalculator();
        int f=fact.findFactorial(n);
        System.out.println("factorial of "+n+ " is "+f);
    }
}
class FactorialCalculator
{
    int findFactorial(int n)
    {
        int fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        return fact;
    }
}