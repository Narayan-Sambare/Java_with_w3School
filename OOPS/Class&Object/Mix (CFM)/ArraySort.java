/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray(int arr[])
Logic: Use Bubble Sort / Selection Sort.
*/

import java.util.*;
public class ArraySort{
	static Scanner sc=new Scanner(System.in);
	int arr1[];
	public static void main(String x[]){
		
		ArraySort s=new ArraySort();
		s.inputArray();
		s.sortArray(s.arr1);
		
	}
	void inputArray(){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr1=arr;
	}
	void sortArray(int arr[]){
		
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}			
	}
	
}
