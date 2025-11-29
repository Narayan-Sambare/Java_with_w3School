/*Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage(int arr[])
Logic: Use sum ÷ total elements.
*/
import java.util.*;
public class ArrayAverage{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		inputArray(arr);
		System.out.print("Sum of array Element :"+findAverage(arr));
	}
	
	public static void inputArray(int arr[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the elemnt in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
	}
	public static double findAverage(int arr[]){
		int sum=0,c=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			c++;
		}
		avg=sum/c;
		return avg;
	}

}
