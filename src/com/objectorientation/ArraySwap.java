package com.objectorientation;
import java.util.Scanner;
public class ArraySwap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		
		System.out.println("Before swapping");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("enter the first index");
		int idx1=sc.nextInt();
		System.out.println("enter the second index");
		int idx2=sc.nextInt();
		int temp;
		temp=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=temp;
		
		System.out.println("after swapping");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
