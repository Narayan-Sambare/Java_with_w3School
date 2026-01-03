// Q4. Take a Vector and add 8 integers.
//  Accept a number from the user and check if it exists in the Vector.
// Searching using loop
// Logical condition:
//  if (vector.get(i) == searchValue)


// Explanation
// Compare each element with the search number.
//  If matched, set a boolean flag to true.

import java.util.*;
import java.util.Vector;
import java.util.Iterator;
public class Q4{
    public static void main(String[] x) {
        Scanner sc=new Scanner(System.in);
        Vector v=new Vector(8);
        temp t[]=new temp[8];
        for(int i=0;i<8;i++)
        {
            t[i]=new temp();
            t[i].set(sc.nextInt());
            v.add(t[i]);
        }

        Iterator i=v.iterator();
        System.out.println("Enter Search key");
        int search=sc.nextInt();
        boolean flag=false;
        while(i.hasNext())
        {
            Object obj=i.next();
            temp c=(temp)obj;

            if(c.get()== search)
            {
                flag=true;
                break;
            }
        }
        System.out.print(flag ? "key is found !": "key not found !");
    }
}
class temp{
    int n;
    int get()
    {
        return n;
    }
    void set(int n)
    {
        this.n=n;
    }
}