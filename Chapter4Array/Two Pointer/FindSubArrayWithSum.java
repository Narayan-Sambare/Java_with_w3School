/*
1. Longest Subarray with Sum ≤ K (non-negative numbers)

Problem:
Given a non‑negative integer array arr[] and an integer K, find the length of the longest contiguous subarray whose sum is ≤ K.

Approach / Explanation:
Because the array has non-negative values, adding more elements increases the sum (it doesn’t go negative). Use a variable-size sliding window:

Maintain two pointers left = 0, right = 0, and a running sum = 0.

Expand right (i.e. include arr[right]) and add to sum.

While sum > K and left ≤ right, shrink from the left: subtract arr[left], increment left.

At each step, if sum ≤ K, consider updating the maximum window length: maxLen = max(maxLen, right - left + 1).

Continue until right traverses whole array.

Example:
arr = [1, 2, 1, 0, 1, 1, 0], K = 4

We can pick subarray [1,2,1,0] (sum 4) length 4, or [0,1,1,0,1] (sum 3) length 5, etc.
The answer would be 5 (subarray [1,0,1,1,0] or similar).

*/


import java.util.*;
public class FindSubArrayWithSum{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String x[]){
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int [n];
		a[]={1, 2, 1, 0, 1, 1, 0};
		FindSubArrayWithSum s=new FindSubArrayWithSum();
		//s.inputArray(a);
		System.out.println("Enter value of K");
		int k=sc.nextInt();
		
		s.FindSubArray(a,k);
	}
	/*
	void inputArray(int a[]){
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			a[i]=s1.nextInt();
		}
	}
	*/
	
	void FindSubArray(int a[],int k){
		int r=0;sum=0;
		int arr[];
		
		for(int i=r;i<a.length;i++)
		{
			
			if(sum<=k)
			{
				sum=sum+a[i];
				arr[c]=a[i];
				c++;
			}
			else if(sum>k && i!=a.length-1)
			{
				arr[]=null;
				c=0;
				r++;
			}
		}
		System.out.print("subarray[");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	System.out.print("]");

		
	}
	
	

}
