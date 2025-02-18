package com.objectorientation;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40};
		int b[]=new int [a.length];
		int j=a.length-1;
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			j--;
		}
			for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]+ " ");
			
		
			
		}

	}

}
