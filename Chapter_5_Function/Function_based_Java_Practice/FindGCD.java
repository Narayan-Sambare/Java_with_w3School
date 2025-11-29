//Q10. Write a function to find the GCD (HCF) of two numbers.

import java.util.*;
public class FindGCD{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        System.out.println("GCD of "+n1+" and "+n2+" is : "+gcd(n1, n2));

    }
    public static int gcd(int n1,int n2)
    {
        int result=0;
        if(n1>n2)
        {
            for(int i=1;i<n1/2;i++)
            {
                if(n2%i==0 &&n1%i==0)
                {
                    result=i;
                }
            }
        }
        else
        {
             for(int i=1;i<n2/2;i++)
            {
                if(n2%i==0 && n1%i==0)
                {
                    result=i;
                }
            }
        }
       
        return result;
    }
}