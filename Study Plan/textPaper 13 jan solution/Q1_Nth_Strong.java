// Q1. Write a java program to display 1 to nth Strong Number.
import java.util.*;
public class Q1_Nth_Strong{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter nth number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isStrong(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isStrong(int n){
        int tem=n;
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
            n/=10;
        }
        return (sum==tem);
    }
}