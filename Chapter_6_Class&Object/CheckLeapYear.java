// 18. Check Leap Year
// Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
// Explanation: Implements logical conditions for leap year calculation.

import java.util.*;
public class CheckLeapYear
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        PrimeChecker fact=new PrimeChecker();
        fact.isLeapYear(n);
       
    }
}
class PrimeChecker
{
    void isLeapYear(int n)
    {
        if(n%4==0)
        {
            System.out.print("leap year");
        }
        else{
            System.out.print("not leap year");
        }
    }

}