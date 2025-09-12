// 4. Check If Array Is Sorted
//  Problem:
// Determine whether an array is sorted in non-decreasing order.
// Example:
// Input: [1, 2, 2, 3, 4]  
// Output: true
import java.util.*;
public class CheckIncOrder
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int c=0;
            System.out.print("Enter 6 Array element\n");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<a.length;i++)
        {
             if(a[i]>=a[i-1])
                {
                     c=1;
                }
                else{
                    c=0;
                    break;
                }
        }
        if(c==1){
               System.out.print("Array is Sorted");
        }
        else{
               System.out.print("Array is not Sorted");
        }

    }
}