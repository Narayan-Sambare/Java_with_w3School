/*
Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/

import java.util.*;
public class ArrayPalindrome{
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		ArrayPalindrome s=new ArrayPalindrome();
		s.inputArray(arr);
		boolean result=s.isPalindrome(arr);
		if(result)
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not palindrome");
		}
	}
	void inputArray(int arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	boolean isPalindrome(int arr[]){
		int odd=0;
		int k=arr.length-1;
		for(int i=0;i<arr.length/2;i++,k--)
		{
			if(arr[i]!=arr[k])
			{
				return false;
			}
		}
		return true;
	}
	
	

}
