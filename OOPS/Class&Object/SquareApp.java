// 8. Find Square of a Number
// Create a class SquareFinder with a method square that calculates the square of a number.
// Explanation: Covers single-parameter logic in methods.

import java.util.*;
public class SquareApp
{   
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        SquareFinder v=new SquareFinder();
        int sq=v.square(n);
        System.out.println("Square of "+n+" is : "+sq);
    }
}
class SquareFinder
{
    int square(int n)
    {
        return n*n;
    }
}