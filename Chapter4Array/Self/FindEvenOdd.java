//Q4. Write a java program to find even and odd number in array.

import java.util.*;
public class FindEvenOdd{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		System.out.println("Even numbers are");

			for(int i=0;i<a.length;i++){
				if(a[i]%2==0)
				{
				System.out.println(i+"-----"	+a[i]);
				}
			
			}
				System.out.println();
				System.out.println("Odd numbers are");
			for(int i=0;i<a.length;i++){
				if(a[i]%2!=0)
				{
				System.out.println(i+"------"+a[i]);
				}
			}

	}
}