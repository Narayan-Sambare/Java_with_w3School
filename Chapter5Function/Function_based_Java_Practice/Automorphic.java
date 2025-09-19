//Q17. Write a function to check if a number is an automorphic number (last digits = square of number).

import java.util.*;
public class Automorphic
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        automorphic(n);
    }
    public static void automorphic(int n)
    {
        int a=1;
        int t=n;
        while(t>0)
        {
            a*=10;
            t=t/10;
        }
        int sq=n*n;
        int rem=sq%a;
                if(n==rem)
                {
                    System.out.println("automorphic number");
                }else
                {
                    System.out.println("non automorphic number");   
                }       
    }

} 