/*
Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/

import java.util.*;
public class ArrayCopy{
	int arr1[];
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
	
		ArrayCopy s=new ArrayCopy();
		s.inputArray();
		int newArr[] = s.copyArray(s.arr1);
		//display new copy array
		for(int i=0;i<newArr.length;i++)
		{
			System.out.println("newArr[" +i+"]="+newArr[i]);
		}
		
	}
	void inputArray(){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr1=arr;
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[" +i+"]="+arr[i]);
		}*/
	}
	
	int[] copyArray(int arr[]){
		int newArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}
		return newArr;
	}
}
