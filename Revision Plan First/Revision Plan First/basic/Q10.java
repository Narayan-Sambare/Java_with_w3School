//10. Write a program to create an array of size 5 and display its value?
import java.util.*;
public class Q10{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	
	int a[] = new int[n];
	System.out.println("Enter the valu in array " + n);
	for(int i=0 ; i<n;i++){
		a[i] = sc.nextInt();
	}
	
	for(int i:a){
	System.out.println(i);
	}
	}
}