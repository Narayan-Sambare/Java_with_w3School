// Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
// Explanation:
// 	This helps you understand:
// How to declare an ArrayList
// How to add elements using add()
// How to traverse an ArrayList using for loop

import java.util.*;
public class CreateArrayList {
    public static void main(String x[])
    {
        ArrayList <Integer> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println("Display list element");
        for(int i:a)
        {
            System.out.print(i +" ");
        }
    }
}
