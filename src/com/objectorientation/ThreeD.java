package com.objectorientation;
import java.util.Scanner;
public class ThreeD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][][]=new int[3][2][5];
		//input 
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2;j++) {
				for(int k=1;k<=5;k++) {
					System.out.println("please enetr the marks of school "+i+" class "+j+" student "+k);
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		//output
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=2;j++) {
				for(int k=1;k<=5;k++) {
					System.out.println(a[i][j][k]+" ");
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		

	}

}
