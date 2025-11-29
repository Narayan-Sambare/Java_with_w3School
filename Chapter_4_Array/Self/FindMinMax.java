//Q3. Write a java program to find maximum and minimum number in array.

import java.util.*;
public class FindMinMax{
	public static void main(String x[])
	{  Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++){
			System.out.println("Enter the "+i+" Element in Array");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		System.out.println("max number is-->"+max);		
		System.out.println("min number is-->"+min);		
	}
}