// Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
// Explanation:
// This improves:
// Index manipulation
// Swapping logic
// Understanding list size
import java.util.*;
public class Reverse{
    public static void main(String x[])
    {
        ArrayList <Integer> a=new ArrayList();
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
        System.out.println("ArrayList before reversing : " +a);
        int j=a.size()-1;
        for(int i=0;i<a.size()/2;i++)
        {
            int temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j--,temp);
        }
        System.out.println("ArrayList after reversing : " +a);
    }
}