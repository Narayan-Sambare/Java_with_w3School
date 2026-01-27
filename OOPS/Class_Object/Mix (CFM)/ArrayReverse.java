/*
Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray(int arr[])
*/
import java.util.*;
public class ArrayReverse{
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		ArrayReverse s=new ArrayReverse();
		s.inputArray(arr);
		s.reverseArray(arr);
		
	}
	void inputArray(int arr[]){
		
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	void reverseArray(int arr[]){
		
		int k=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int tem=arr[i];
			arr[i]=arr[k];
			arr[k]=tem;
			k--;
		}
		System.out.println("reverse Array :");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		
	}
	
	

}
