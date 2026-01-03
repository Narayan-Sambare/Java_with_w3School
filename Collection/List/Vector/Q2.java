// Q2. Create a Vector of integers.
// Store 10 numbers and count how many numbers are greater than 50.
// Iteration
// Logical comparison: num > 50
// Counter concept
// Explanation
// Use a counter that increases each time the number is greater than 50.

import java.util.Iterator;
import java.util.Vector;

public class Q2 {
    public static void main(String[] x){
        Vector<Integer> v=new Vector();
        v.add(10);        
        v.add(20);        
        v.add(30);        
        v.add(40);        
        v.add(50);        
        v.add(60);        
        v.add(70);        
        v.add(80);        
        v.add(90);        
        v.add(95);     
        
        Iterator i= v.iterator();
        int c=0;
        while (i.hasNext()) {
            
             if((int)i.next()>50)
             {
                c++;
             }
        }
        System.out.println(c);

    }
}