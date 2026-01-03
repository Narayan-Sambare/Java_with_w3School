// Q7. Write a java program to Remove all even numbers from an integer ArrayList.
// Explanation:
// This teaches:
// Removing elements using remove(index)
// Handling shifting of elements after removal
// Reverse loop concept

import java.util.*;
public class Remove{
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the value for arrayList :");
        // for(int i=0;i<5;i++)
        // {
        //     a.add(sc.nextInt());
        // }
        a.add(1);
        a.add(2);   
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        
        System.out.println("ArrayList before removing even numbers : " +a);
        Iterator it=a.iterator();
        int k=0;
        while(it.hasNext())
        {
            int i=(int)it.next();
            if(i%2==0)
            {
                it.remove();
            }
        }
        System.out.println("ArrayList after removing even numbers : " +a);
        System.out.print("ArrayList in reverse order : ");
        ListIterator listit= a.listIterator(a.size());  
        while(listit.hasPrevious())
        {
            System.out.print(listit.previous()+" ");
        }

  }
}
