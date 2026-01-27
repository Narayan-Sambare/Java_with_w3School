// 20. Calculate Sum of 1 to Nth Natural Numbers
// Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
// Explanation: Reinforces loops and arithmetic series formula.

//class method
import java.util.*;
public class SumOf1_Nth
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        NaturalNumberSum s=new NaturalNumberSum();
        int sum=s.calculateSum(n);
        System.out.println("sum of all natural number"+sum);
    }
}
class NaturalNumberSum
{
    int calculateSum(int n)
    {
        int sum=0;
            for(int i=1;i<=n;i++)
            {
                sum+=i;
            }
        return sum;
    }

}