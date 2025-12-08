/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax(int arr[]) → display maximum element
int findMin(int arr[]) → display minimum element
Logic: Loop through array, compare each element, store max.
*/
import java.util.*;
public class ArrayMax{
    public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
        inputArray(arr);
		System.out.println("Max element in array: "+findMax(arr));
		System.out.println("min element in array: "+findMin(arr));
	
         
    }
	
	public static void inputArray(int arr[]){ 
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
    }
	
	public static int findMax(int arr[]){
		int mx=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>mx)
			{
				mx=arr[i];
			}
		}
		return mx;
	}
	
	public static int findMin(int arr[]){
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	
}
