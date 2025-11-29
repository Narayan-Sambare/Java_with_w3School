// 15. Swap Two Numbers
// Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
// Explanation: Covers mathematical operations for swapping.

import java.util.*;
public class Swap2No
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int [2];
        for(int i=0;i<a.length;i++)
        {   System.out.println("Enter the one number :");
            a[i]=sc.nextInt();
        }

        System.out.println("Befor swap :");
        for(int i=1;i<=a.length;i++)
        {
            System.out.println("n"+i+"-->"+a[i-1]+" ");
        }
       
       
        Swapper sp=new Swapper();
       a=sp.swap(a);
       System.out.println("\nAfter a swap :");
      for(int i=1;i<=a.length;i++)
        {
            System.out.println("n"+i+"-->"+a[i-1]+" ");
        }
       
    }
}
class Swapper
{
    int[] swap(int a[])
    {
        a[0]=a[0]+a[1];
        a[1]=a[0]-a[1];
        a[0]=a[0]-a[1];
        return a;
    }

}