// Q3. Write a program to find the maximum value from an integer ArrayList.
// Explanation:
//  You will learn:
// How to compare elements
// Store maximum value manually
// Logical thinking without built-in methods

import java.util.ArrayList;
import java.util.Scanner;
public class MaxValue
{
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        int max=0;
        for(int i:a)
        {
            if(i>max)
            {
                max=i;
            }
        }
        System.out.println("Max value form Array List :"+max);

    }
}
