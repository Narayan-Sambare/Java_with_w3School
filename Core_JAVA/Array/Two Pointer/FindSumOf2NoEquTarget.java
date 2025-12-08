// Q3. Count how many pairs in an unsorted array sum up to a target using two pointers.

import java.util.*;
public class FindSumOf2NoEquTarget
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
		  
		System.out.println("Enter target number");
		int target=sc.nextInt();
		
        System.out.print("Enter "+n+" Array element\n");//target=4 -- 1 2 3 2 1 -- n=5
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

        int L=0,R=a.length-1;
		 System.out.println();
		 while(L<a.length)
		 { 
			 int sum=a[L]+a[R];
			 if(sum==target)
			 {
				 System.out.print("("+a[L]+","+a[R]+")");				 
			 }
              R--;			 
                if(L>=R)
				{
					R=a.length-1;//reset to last element
					L++; //
				}			
		 }
   
    }
}