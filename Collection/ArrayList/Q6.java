/*
Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/
import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vector v=new Vector();
        Vector add=new Vector();
        for(int i=0;i<5;i++)
        {   System.out.println("Enter integer "+(i+1)+" : ");
            v.add(sc.nextInt());
        }
        Iterator it=v.iterator();
        while (it.hasNext()) {
            int n=(int)it.next();
            if (add.contains(n)) 
            {
                continue;
            }
            else
            {
                add.add(n);
            } 
        }
        System.out.println("Original Vector: "+v);
        System.out.println("Vector after removing duplicates: "+add);
    }
}