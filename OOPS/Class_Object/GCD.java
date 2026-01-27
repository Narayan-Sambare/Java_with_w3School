// 19. Find GCD of Two Numbers
// Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
// Explanation: Introduces loops and mathematical relationships.


//class method
import java.util.*;
public class GCD
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number :");
        int n2=sc.nextInt();

        GCDCalculator s=new GCDCalculator();
        int gcd=s.findGCD(n1,n2);

        System.out.println("GCD : "+gcd);
    }
}
class GCDCalculator
{
    int findGCD(int n1,int n2)
    {
        int gcd=0;
        if(n1>n2)
        {
            for(int i=1;i<n1/2;i++)
            {
                if(n1%i==0&&n2%i==0)
                {
                    gcd=i;
                }
            }
        }
        else
        {
            for(int i=1;i<n2/2;i++)
            {
                if(n1%i==0&&n2%i==0)
                {
                    gcd=i;
                }
            }
        }
        return gcd;
    }

}