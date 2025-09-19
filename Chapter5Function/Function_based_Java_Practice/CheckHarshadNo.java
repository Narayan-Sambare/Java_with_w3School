//Q12. Write a function to check whether a number is a Harshad number (divisible by sum of its digits).

import java.util.*;
public class CheckHarshadNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n=sc.nextInt();
        isHarshad(n);
    }
    // harshada number logic function
    public static void isHarshad(int n)
    {   int t=n;
         int sum=0;
        while(n>0)
        {  
            sum=sum+(n%10);
            n=n/10;
        }
        
        if(t%Sum==0)
        {
           System.out.println("Harshad number ");
        }
        else
        {
           System.out.println("Not Harshad number ");
        }
       
     }  
    
}