//Q5. Write a java program to implement binary search from array.
//Input:
//Array: 10 20 30 40 50 60
//Search: 40
//Output: Element found at index 3


package Test_23_March;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Size of Array :");
//		int n=sc.nextInt();
//		int a[]=new int [n];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("Enter "+(i+1)+" value in Array :");
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Enter search key :");
//		int key=sc.nextInt();
		
		int a[]= {10,20,30,40,50,60};
		int key=80;
		int idx=0;
		int f=0;
		int l=a.length-1;
		boolean flg=false;
		
		while(f<=l)
		{	int mid=(f+l)/2; //divide the array in mid every time 
			if(a[mid]==key) //check the key is present or not
			{
				flg=true;
				idx=mid;
				break;
			}else if(a[mid]>key)
			{
				l=mid-1;// if key is less find left side
			}
			else if(a[mid]<key)
			{
				f=mid+1;// if key is greate find right side
			}
		}
		//print the result 
		if(flg)
		{
			System.out.println("Element found at index : "+idx);
		}
		else {
			System.out.println("Element not found ! ");
		}

	}

}
