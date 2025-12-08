s//Q2. Write a java program to calculate sum of array is size 5.
import java.util.*;
public class SumOfElement{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int b=0;
		for(int i=0;i<a.length;i++){
		System.out.println("Enter the "+i+" element");
		a[i]=sc.nextInt();
		}	
		for(int i=0;i<a.length;i++){
			b=b+a[i];
		}	
		System.out.println("sum of array Element-->"+b);
		
	
	}
}