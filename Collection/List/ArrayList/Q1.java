/*
Q1. Given an integer array, convert it into an ArrayList.
Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;
public class Q1{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList arr=new ArrayList<>();
        int array[]=new int[10];
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter "+(i+1)+" value ");
            array[i]=sc.nextInt();
        }
        for(int i: array)
        {
            arr.add(i);
        }
        System.out.println("before remove");
        System.out.println(arr);
        Iterator i=arr.iterator();
        while(i.hasNext())
        {
            
            int n=(int)i.next();
            if(n % 2==0)
            {
                i.remove();
            }
        }
        System.out.println("after remove");
        System.out.println(arr);
        

    }
}
