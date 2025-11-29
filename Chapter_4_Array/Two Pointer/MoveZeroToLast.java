/*
Q6. Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/

import java.util.*;
public class MoveZeroToLast
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]={1,0,3,0,5};
		int k=a.length-1;
		System.out.println("without remove zeros");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[" +i+"]="+a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[k];
				//  for(int j=i;j<a.length-1;j++)
				//  {
				// 	   a[j]=a[j+1];
				//  }
				a[k]=a[i];
				a[i]=temp;
				k++;
		
			}
			
		}
		System.out.println(" remove zeros");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[" +i+"]="+a[i]);
		}
	}
}
		