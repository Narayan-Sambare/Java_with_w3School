/*
Q5. Write a java program to find the maximum product of two integers in a given array of
integers.
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56
*/
//function code
import java .util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int as=sc.nextInt();
         if(as<2)
        {
            System.out.println("Array size is less please enter greater size\n________________Thank You !________________\n");
            return;
        }
		int a[]=new int[as];
       
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter "+(i+1)+" Element in array");
            a[i]=sc.nextInt();
        }
		
		findMaxPro(a);
	}

	
	 public static void findMaxPro(int a[])
	 {
        
        int MP=0;
        int f=0,l=0;
        int j=0,i=j+1;
		while(j<a.length-1)
        {
            if(MP<(a[j]*a[i]))
            {
                MP=a[j]*a[i];
                f=j;
                l=i;
            }
            i++;
            if(i==a.length)
            {
                j++;
                i=j+1;
            }
        }
        System.err.println("pair is ("+a[f]+","+a[l]+") and max product is : "+MP );
		
	 }
}