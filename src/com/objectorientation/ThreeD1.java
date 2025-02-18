package com.objectorientation;
import java.util.Scanner;
public class ThreeD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[3][2][5];
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
