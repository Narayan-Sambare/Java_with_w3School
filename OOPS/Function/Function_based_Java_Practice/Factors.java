//Q7. Write a function to print the factors of a number.

import java.util.*;
public class Factors
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        factor(n);
        

    }
    public static void factor(int n)
    {  
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+", ");
            }            
        }
    }
}
