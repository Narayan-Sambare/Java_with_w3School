/*
Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int arr[], int key)
Logic: Traverse array, check if key matches any element.
*/
import java.util.*;
public class ArraySearch{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		ArraySearch as=new ArraySearch();
		as.inputArray(arr);
		System.out.println("Enter the searchElement");
		int key=sc.nextInt();
		boolean result=as.searchElement(arr,key);
		
		if(result)
		{	
		System.out.print("Kay match");
		}else{
		System.out.print("Kay not match");
		}
			
			
	}
	void inputArray(int arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
	}
	boolean searchElement(int arr[], int key){
		
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				return true;
			}
		}
		return false;
	}

}
