// 7.Write a program to input number and check number is palindrome or not?

import java.util.*;
public class Q7
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int tem=n;
        int rev=0;

        while (n > 0)
        {
            rev = rev*10+n%10;
            n = n/10;
        }

        if (tem == rev) {
            System.out.println(tem + " is a Palindrome Number.");
        } 
        else
        {
            System.out.println(tem + " is not a Palindrome Number.");
        }
    }
}