package com.objectorientation;
import java.util.Scanner;
public class ThreeD2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//school
		int a[][][]=new int[3][][];
		//classes
		 a[0]=new int[3][];
		 a[1]=new int[1][];
		 a[2]=new int[2][];
		 //student
		 a[0][0]=new int[4];
		 a[0][1]=new int[3];
		 a[0][2]=new int[5];
		 
		 a[1][0]=new int[4];
		 
		 a[2][0]=new int[3];
		 a[2][1]=new int[4];
		//input 
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=a[i].length;j++) {
				for(int k=1;k<=a[i][j].length;k++) {
					System.out.println("please enetr the marks of school "+i+" class "+j+" student "+k);
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		//output
		for(int i=1;i<=a.length;i++) {
			for(int j=1;j<=a[i].length;j++) {
				for(int k=1;k<=a[i][j].length;k++) {
					System.out.println("school"+a[i][j][k]);
					
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
