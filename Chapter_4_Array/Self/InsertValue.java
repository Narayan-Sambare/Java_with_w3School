/*
Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
public class InsertValue
{	public static void main(String x[])
    {	Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
        for(int i=0;i<n-1;i++)//take input
        {
            a[i]=sc.nextInt();
        }
		System.out.println("enter index number for replace value");
        int newidx=sc.nextInt();
		
		System.out.println("enter number for replace value");
        int newValue=sc.nextInt();

		for(int i=a.length-2;i>=newidx;i--)//display array
        {
			System.out.println(a[i+1]=a[i]	);
        }
		a[newidx]=newValue;
        for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
    }
}