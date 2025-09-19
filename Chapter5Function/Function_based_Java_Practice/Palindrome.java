// Q4. Write a function to check if a given number is a palindrome number.

import java.util.*;
public class Palindrome
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        isPalindrom(n);
        

    }
    public static void isPalindrom(int n)
    {   int tem=n;
        int rev=0;
        while(n>0)
        {   rev=rev*10+n%10;
            n=n/10;
        }
        if(tem==rev)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("not Palindrome");
        }
    }
}
