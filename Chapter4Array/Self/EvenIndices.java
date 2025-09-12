//Q11. Print array elements at even indices.
//Input: arr = [4, 9, 7, 11, 6]
//Output: 4 7 6
//Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.

import java.util.*;
public class EvenIndices
{
	public static void main(String x[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");//5
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
		for(int i=0;i<a.length;i+=2)
        {
		System.out.println("a[" +i+"]="+a[i]);
        }
			
        
    }
}
