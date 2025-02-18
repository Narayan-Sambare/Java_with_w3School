package com.objectorientation;
import java.util.Scanner;
public class TwoD1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[3][5];
		//class input
		System.out.print("enter the no of classes ");
		int c=sc.nextInt();
		System.out.print("enter the no of student in class  ");
		int s=sc.nextInt();
		
		for(int i=1;i<c+1;i++) {
			for(int j=1;j<s;j++)
			{
				System.out.println("marks of class "+i+" sudent "+j);
				a[j][j]=sc.nextInt();
			}
		}
			//output
			for(int i=0;i<c;i++) {
				for(int j=0;j<s;j++)
				{
					System.out.print(a[j][j]+" ");
				}
			}
			
			
		}
	}


