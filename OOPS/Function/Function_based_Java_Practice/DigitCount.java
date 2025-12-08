//Q18. Write a function to count the number of digits in a given number.
import java.util.*;
public class DigitCount
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println(count(n)+" digit ");

    }
     public static int count(int n)
     {
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
}
