// Q6. Count Number of Even and Odd Elements
//  Problem:
// Count how many even and odd elements are present.
// Example:
// Input: [1, 2, 3, 4, 5, 6]  
// Output: Even: 3, Odd: 3

import java.util.*;
public class CountEvenOrOddNo
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        int even=0,odd=0;
            System.out.print("Enter 6 Array element\n");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.print("even-->"+even);
        System.out.print("odd-->"+odd);
    }
}