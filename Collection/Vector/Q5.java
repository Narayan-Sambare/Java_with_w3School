// Q5. Create a Vector of 10 integers (including negative numbers).
// Remove all negative values and print the updated Vector.
// Condition: num < 0
// Removing elements
// Using loop carefully when removing values
// Explanation
// Negative numbers are less than 0.
//  You can use a loop with index backward to safely remove elements.

import java.util.*;
public class Q5{
    public static void main(String[] x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of vector");
        int size=sc.nextInt();
        Vector <Integer> v=new Vector(size);
        
        for(int i=0;i<v.capacity();i++)
        {
            System.out.println("Enter "+(i+1)+" value");
            v.add(sc.nextInt());
        }
        System.out.println("original vector");
        System.out.print(v);


        // Iterator a=v.iterator();
        // while(a.hasNext())
        // {
        //     System.out.print(a.next()+" ");
        // }
        for(int i=0;i<v.size();i++)
        {
            if(v.get(i)<0)
            {    
                v.remove(i);
                i--;             
            }
        }
            System.out.println("\nnew vector");
            System.out.print(v);
        
    }
}