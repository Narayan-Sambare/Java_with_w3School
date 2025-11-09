// 8.Write program to input number and check number is Armstrong or not?
import java.util.*;
public class Q8
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int tem=n;
        int sum=0;
        int digits=count(n);
        System.out.println(digits);

        n=tem;
        while (n > 0)
        {   
            int ts =1;
           for(int i=0; i<digits; i++)
           {
                ts = ts * (n % 10);
           }
            sum = sum + ts;
            n = n/10;
        }
    
        if (tem == sum) {
            System.out.println(tem + " is an Armstrong Number.");
        } 
        else
        {
            System.out.println(tem + " is not an Armstrong Number.");
        }
    }

    static int count(int n)
    {
        int count=0;
        while (n > 0)
        {
            count++;
            n = n/10;
        }
        return count;
    }
}