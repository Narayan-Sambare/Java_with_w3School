//Q3. Write a function to find the reverse of a number.

import java.util.*;
public class ReverseNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=revNo(n);
        System.out.println("reverse number :"+rev);

    }
    public static int revNo(int n)
    {
        int rev=0;
        while(n>0)
        {   rev=rev*10+n%10;
            n=n/10;
        }

        return rev;
    }
}
