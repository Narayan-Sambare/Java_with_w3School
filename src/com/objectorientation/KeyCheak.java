package com.objectorientation;
import java.util.Scanner;
public class KeyCheak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		
		System.out.println("enter the key to search");
		int key=sc.nextInt();
		int index=0;
		boolean found=false;
		
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]==key) {
				found=true;
				index=i;
				break;
			}
		}
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			if(found==true) {
				System.out.println("key is found at index"+index);
				
			}
		
		else {
			System.out.println("key is not found");
		}
	}
	}


