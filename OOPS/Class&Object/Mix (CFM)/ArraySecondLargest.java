/*
Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
*/
import java.util.*;
public class ArraySecondLargest{
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int arr[]=new int [n];
		ArraySecondLargest s=new ArraySecondLargest();
		s.inputArray(arr);
		int result=s.findSecondLargest(arr);
		System.out.println("second max in array :"+result);
		
	}
	void inputArray(int arr[]){
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	int findSecondLargest(int arr[]){
		int sm=0;
		int mx=0;
		for(int i=0;i<arr.length;i++)
		{
			if(mx<arr[i])
			{	sm=mx;
				mx=arr[i];
			}
			else if(sm<arr[i]&&mx>arr[i])
			{
				sm=arr[i];
			}
			else{}
		}
		return sm;
	}
	
	

}
