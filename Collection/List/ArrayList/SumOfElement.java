// Q2. Create an ArrayList of integers and calculate the sum of all elements.

// 	Explanation:
// 	 This question practices:
// Iterating over ArrayList
// Performing arithmetic operations
// Using get(index) method

import java.util.*;
public class SumOfElement
{
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        int sum=0;
        for(int i:a)
        {
            sum+=i;
        }
        System.out.println("Sum of all element in ArrayList : "+sum);
    }

}