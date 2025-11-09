// 9.Write program to check number is prime or not?

import java.util.*;
public class Q9
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result=isPrime(n);

        if (result) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
    static boolean isPrime(int n)
    {
        if (n <= 1) 
        {
            return false;
        }
        for (int i = 2; i < n/2; i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}