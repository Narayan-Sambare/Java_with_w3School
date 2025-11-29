/*
Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/

import java.util.*;
public class ArrayFrequency{
	static int a[];
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		ArrayFrequency s=new ArrayFrequency();
		s.inputArray(n);
		s.countFrequency(a);
		
	}
	void inputArray(int n){
		int arr[]=new int [n];
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		a=arr;
	}
	void countFrequency(int arr[]){
		int count;
		for(int i=0;i<arr.length;i++)
		{	count=1;
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]==arr[j] && arr[j]!=999)
				{	arr[j]=999;
					count++;
				}
			}
			if(arr[i]!=999){
			System.out.println("count of "+arr[i]+" = "+count);
			}
			
		}
		
	}
	
	

}
