package com.objectorientation;
import java.util.Scanner;
public class If_Else {
	public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
	System.out.println("please enter the size of array");
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0; i<arr.length;i++) {
		System.out.println("please enter the element of index"+i);
		int key=sc.nextInt();
		boolean found =false;
		int index=0;
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
		 if(key==arr[mid]){
			 found=true;
			 index=mid;
			 break;
		 }
		 else if(key>arr[mid]) {
			 low=mid+1;
			 mid=(low+high)/2;
		 }
		 else if(key<arr[mid]) {
			 low=mid-1;
			 mid=(low+high)/2;
		 }
		
		}
		 for( i=0; i<arr.length;i++) {
			 System.out.println(arr[i]+" ");
		 }
		 System.out.println();
		 if(found==true) {
			 System.out.println("key is found"+index);
			 }
		 
		 else {
			 System.out.println("key is not found");
		 }}}}
	

