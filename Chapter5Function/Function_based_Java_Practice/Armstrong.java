// Q5. Write a function to check if a given number is a Armstrong number.


import java.util.*;
public class Armstrong
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        isArmstrong(n);
    }
    public static void isArmstrong(int n)
    {   int tem=n,arm=0;
        int pow=count(n);
        while(n>0)
        {  
            int rem=n%10;
            int i=pow,result=1;
            while(i>0)
            {
                result*=rem;
                i--;   
            }
            n=n/10;
            arm+=result;
        }
        if(tem==arm)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }
    public static int count(int n){
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}
