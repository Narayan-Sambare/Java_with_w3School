//Q4. Write a program in java to rotate an array by N positions without using other array.
//Input:
//The given array is: 0 3 6 9 12 14 18 20 22 25 27
//From 4th position the values of the array are: 12 14 18 20 22 25 27
//Before 4th position the values of the array are: 0 3 6 9
//After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3 6 9

package Test_23_March;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Size of Array :");
//		int n=sc.nextInt();
//		int a[]=new int [n];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("Enter "+(i+1)+" value in Array :");
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Enter kth position :");
//		int k=sc.nextInt();
		
		
		int a[]= {0,3,6,9,12,14,18,20,22,25,27};
		int k=4;
		
		if(k>a.length-1) // for verify the user k value is less than array size 
		{
			System.out.print("please enter valid k  value :");
		}
		
		for(int i=0;i<k;i++)  //for k th time travel the array
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)  // for swap the array by one by one 
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		
		for(int i:a)   //print the arrya output
		{
			System.out.print(i+" ");
		}
	}

}
