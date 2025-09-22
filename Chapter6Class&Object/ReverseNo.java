// 11. Reverse a Number
// Create a class NumberReverser with a method reverse that reverses a given integer number.
// Explanation: Covers basic loops for number manipulation
// 

import java.util.*;
public class ReverseNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        NumberReverser r= new NumberReverser();
        int result=r.reverse(n);
        System.out.println("reverse of the number :"+result);
    }
}
class NumberReverser
{
    int reverse(int n)
    {   int rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        return rev;
    }
}