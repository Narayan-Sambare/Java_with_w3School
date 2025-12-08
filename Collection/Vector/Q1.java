// Q1. Write a Java program to store 5 integers in a Vector.
//  Print only the even numbers using a loop.
// Vector creation
// Adding elements
// Logical condition: num % 2 == 0
// Explanation
// Even numbers are divisible by 2, so we check each number using modulus operator.

import java.util.Iterator;
import java.util.Vector;
public class Q1{
    public static void main(String[] x) {
        Vector v=new Vector(5);
        v.add(5);
        v.add(3);
        v.add(10);
        v.add(8);
        v.add(6);
        v.add(1);
        Iterator i=v.iterator();
        
        while(i.hasNext())
        {
            if((int)i.next()%2==0){
                System.out.println(i.next());
            }
            
        }

    }
}