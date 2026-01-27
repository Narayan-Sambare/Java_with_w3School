/*
Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven(int arr[])
int countOdd(int arr[])
Logic: Use % 2 == 0 check.
*/

import java.util.*;
public class ArrayEvenOdd{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		ArrayEvenOdd s=new ArrayEvenOdd();
		s.inputArray(arr);
		int ec=s.countEven(arr);
		int oc=s.countOdd(arr);
		
		System.out.println(ec+" : even number");
		System.out.println(oc+" : odd number");
		
	}
	void inputArray(int arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
	}
	int countEven(int arr[]){
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
		}
		return even;
	}
	int countOdd(int arr[]){
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				odd++;
			}
		}
		return odd;
	}
	
	

}
