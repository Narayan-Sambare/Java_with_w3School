/*
Q14. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target.
*/
import java.util.*;
public class ArrayPairSum{
		static Scanner sc=new Scanner(System.in);
		int a[];
	public static void main(String x[]){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		ArrayPairSum s=new ArrayPairSum();
		s.inputArray(arr);	
		System.out.println("Enter target kay");
		int target=sc.nextInt();
		s.findPairs(target);
	}
	void inputArray(int arr[]){
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		a=arr;
	}
	
	void findPairs(int target){
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("("+a[i]+","+a[j]+")");
				}
			}
		}
	}
	
	

}
