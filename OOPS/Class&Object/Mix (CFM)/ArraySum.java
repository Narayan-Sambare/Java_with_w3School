/*Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum(int arr[])
*/

import java.util.*;
public class ArraySum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		inputArray(arr);
		System.out.print("Sum of array Element :"+calculateSum(arr));
	}
	public static void inputArray(int arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
	}
	public static int calculateSum(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

}
