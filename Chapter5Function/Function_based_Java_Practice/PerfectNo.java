//Q8. Write a function to check if a number is a perfect number.


import java.util.*;
public class PerfectNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        isPerfect(n);
        

    }
    public static void isPerfect(int n)
    {  int per=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                per=per+i;
            }        
        }
        if(per==n)
            {
                System.out.println("Perfect Number");
            } 
            else
            {
                System.out.println("Not Perfect Number");
            }   
    }
}
