//Q13. Write a function to generate the Fibonacci series up to n terms.

import java.util.*;
public class FibNTerms
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n terms");
        int n=sc.nextInt();
        fib(n);
    }
    public static void fib(int n)
    {
        int f1=0,f2=1,sum=0;
        if(n==1)
        {
            System.out.print(f1);
        }
        else if(n==2)
        {
            System.out.print(f1+" "+f2);
        }
        else
        {   
            System.out.print(f1+"  "+f2+"  ");
             for(int i=3;i<=n;i++)
             {
                sum=f1+f2;
                f1=f2;
                f2=sum;
                System.out.print(sum+", ");
             }
        }
       
        
    }
}