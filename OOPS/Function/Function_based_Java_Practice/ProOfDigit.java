//Q19. Write a function to find the product of digits of a given number.

import java.util.*;
public class ProOfDigit
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("product is "+isProduct(n));
    }
    public static int isProduct(int n)
    { 
       int p=1;
        while(n>0)
        {
            p=p*(n%10);
            n=n/10;
        }
        return p;
    }
}