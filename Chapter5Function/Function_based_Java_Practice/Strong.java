//Q9. Write a function to check if a number is a strong number (sum of factorial of digits = number).


import java.util.*;
public class Strong
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        isStrong(n);
    }
    public static void isStrong(int n)
    {   int fs=0,t=n;
        while(n>0)
        {   
            int rem=n%10;
            n=n/10;
            int f=fact(rem);
            fs=fs+f;
        }
        if(t==fs)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
    public static int fact(int n)
    {   int fact=1;
        for(int i=n;i>0;i--)
        {
            fact*=i;
        }
        return fact;
    }
}