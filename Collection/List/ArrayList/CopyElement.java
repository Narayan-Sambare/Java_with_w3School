// Q9. Write a java program to Copy all elements from one integer ArrayList to another.
// Explanation:
//  This practices:
// Working with multiple ArrayList objects
// Element-by-element copying

import java.util.*;
public class CopyElement{

    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList();
        ArrayList<Integer> b=new ArrayList();
        System.out.println("Enter the value for arrayList a :");
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // a.add(4);
        // a.add(5);
        System.out.println("ArrayList a : " +a);
        for(int i=0;i<a.size();i++)
        {
            b.add(a.get(i));
        }
        System.out.println("ArrayList b : " +b);
        

    }
}