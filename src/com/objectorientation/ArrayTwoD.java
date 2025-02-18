package com.objectorientation;
import java.util.Scanner;
public class ArrayTwoD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[5][5];
		//i/p
		//class 0
		a[0][0]=11;
		a[0][1]=12;
		a[0][2]=13;
		a[0][3]=14;
		a[0][4]=15;
		
		//class 1
				a[1][0]=21;
				a[1][1]=22;
				a[1][2]=23;
				a[1][3]=24;
				a[1][4]=25;
				
				//class 2
				a[2][0]=31;
				a[2][1]=32;
				a[2][2]=33;
				a[2][3]=34;
				a[2][4]=35;
				
				//class 3
				a[3][0]=31;
				a[3][1]=42;
				a[3][2]=43;
				a[3][3]=44;
				a[3][4]=45;
				
				//class 4
				a[4][0]=51;
				a[4][1]=52;
				a[4][2]=53;
				a[4][3]=54;
				a[4][4]=55;
				
				//o/p
				//class 0
				System.out.println();
				System.out.print(a[0][0]+" ");
				System.out.print(a[0][2]+" ");
				System.out.print(a[0][1]+" ");
				System.out.print(a[0][3]+" ");
				System.out.print(a[0][4]+" ");
				
				//class 1
				System.out.println();
				System.out.print(a[1][0]+" ");
				System.out.print(a[1][2]+" ");
				System.out.print(a[1][1]+" ");
				System.out.print(a[1][3]+" ");
				System.out.print(a[1][4]+" ");
				//class 2
				System.out.println();
				System.out.print(a[2][0]+" ");
				System.out.print(a[2][2]+" ");
				System.out.print(a[2][1]+" ");
				System.out.print(a[2][3]+" ");
				System.out.print(a[2][4]+" ");
				//class 3
				System.out.println();
				System.out.print(a[3][0]+" ");
				System.out.print(a[3][2]+" ");
				System.out.print(a[3][1]+" ");
				System.out.print(a[3][3]+" ");
				System.out.print(a[3][4]+" ");
				//class 5
				System.out.println();
				System.out.print(a[4][0]+" ");
				System.out.print(a[4][2]+" ");
				System.out.print(a[4][1]+" ");
				System.out.print(a[4][3]+" ");
				System.out.print(a[4][4]+" ");
	}

}
