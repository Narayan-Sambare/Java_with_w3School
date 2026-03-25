//Q2. Write a program to reverse an array using recursion.
//Input:
//Array:
//10 20 30 40 50
//Output:
//Reversed Array


package Test_23_March;
import java.util.*;
public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array :"); //for user input size of array
		int n=sc.nextInt();
		int a[]=new int [n];
		
		for(int i=0;i<a.length;i++)  // get the user array value
		{
			System.out.println("Enter "+(i+1)+" value in Array :");
			a[i]=sc.nextInt();
		}
		
		int f=0,l=a.length-1;
		int result[]=revers(a,f,l);	 // first function call
		
		for(int i:result)// for print the result revers array
		{
			System.out.print(i+" ");
		}
	}
	// reverse function
	static int [] revers(int[] a ,int f,int l) {  
		
		if(f>l)
		{
			return a;    // best condition
		}
		int temp=a[f];
		a[f]=a[l];
		a[l]=temp;
		return revers(a, ++f,--l); //array recall
	}
}
