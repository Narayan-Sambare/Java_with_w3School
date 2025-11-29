//Q11. Write a function to find the LCM of two numbers using HCF.

import java.util.*;
public class FindLCMUsingHCF{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        System.out.println("LCM of "+ n1 +" and "+ n2 +" is : "+lcm(n1, n2));
    }
    // lcm logic function
    public static int lcm(int n1,int n2)
    {
       int lcm=(n1*n2)/(hcf(n1,n2));
        return lcm;
    }

    // hcf logic fuction
    public static int hcf(int n1,int n2)
    {
        int hcf=0;
        if(n1>n2)
        {
            for(int i=1;i<n1/2;i++)
            {
                if(n2%i==0 && n1%i==0)
                {
                    hcf=i;
                }
            }
        }
        else
        {
             for(int i=1;i<n2/2;i++)
            {
                if(n2%i==0 && n1%i==0)
                {
                    hcf=i;
                }
            }
        }
       
        return hcf;
    }
}