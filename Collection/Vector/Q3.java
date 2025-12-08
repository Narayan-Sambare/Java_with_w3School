// Q3. Store any 7 integers in a Vector.
//  Calculate and print the sum of all elements.
// Addition operation
// Looping through Vector
// Explanation
// Keep a variable sum initially 0, then add each element.

import java.util.Vector;
import java.util.Iterator;

public class Q3{
    public static void main(String []x) {
        Vector<Integer> v= new Vector(7);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        Iterator i=v.iterator();
        int sum=0;
        while(i.hasNext())
        {
           int n=(int) i.next();
            sum+=n;
        }
        System.out.println(sum);
    
    }
}