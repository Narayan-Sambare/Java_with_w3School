// Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
// Explanation:
// This helps you understand:
// Nested loops
// Comparison logic
// Handling repeated values

import java.util.*;
class DisplayDublicate{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> a=new ArrayList();
       
        System.out.println("Enter the value for arrayList :");
        for(int i=0;i<5;i++)
        {
           a.add(sc.nextInt()); 
        }
        // a.add(1);
        // a.add(12);
        // a.add(12);
        // a.add(1);
        // a.add(5);
        // a.add(5);
        // a.add(7);
        // a.add(8);
        // a.add(8);
        // a.add(9);

        System.out.println("original array list :"+a);
        HashSet <Integer> s=new HashSet();       
        for(Integer i:a)
        {
            s.add(i);
        }
        System.out.println("New array list :"+s);

    }
}
        