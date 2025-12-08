/*Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/
import java.util.*;
public class ArrayMerge{
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[]){
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr1[]=new int [n];
		int arr2[]=new int [n];
		
		ArrayMerge s=new ArrayMerge();
		s.inputArray(arr1,arr2);
		int a[] =s.mergeArrays(arr1,arr2);
		System.out.println("murge arrays");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[" +i+"]="+a[i]);
		}
		
		
	}
	void inputArray(int arr1[], int arr2[]){
		System.out.println("enter the elemnt in 1st array");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the elemnt in 2nd array");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
	}
	
	int [] mergeArrays(int arr1[],int arr2[]){
		int newAry[] =new int [arr1.length + arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			newAry[i]=arr1[i];
			newAry[i+arr1.length]=arr2[i];
		}
		return newAry;
	}
	
	

}
