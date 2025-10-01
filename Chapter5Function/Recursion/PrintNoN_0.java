//Q7 Write a program to print numbers from n down to 1 using recursion.


import java .util.*;
public class PrintNoN_0
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		printNumber(n);
	}

	
	 public static void printNumber(int n)
	 {
		if(n>=0)
		{
			System.out.print(n+" ");
			printNumber(--n);
		}
	 }
}