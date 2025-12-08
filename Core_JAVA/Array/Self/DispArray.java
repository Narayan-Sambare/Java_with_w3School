//Q1. Write a java program to take input from array of size 5 and display it.

import java.util.*;
public class DispArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]--->"+a[i]);
		}
	}
}
		