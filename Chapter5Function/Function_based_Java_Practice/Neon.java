//Q20. Write a function to check whether the given number is a neon number (sum of digits of square = number).
import java.util.*;
public class Neon
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        isNeon(n);
    }
    public static void isNeon(int n)
    {
        int sq=n*n;
        int sum=0;
        while(sq>0)
        {
            sum+=(sq%10);
            sq/=10;
        }
        if(sum==n)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Not Neon");
        }
    }
}