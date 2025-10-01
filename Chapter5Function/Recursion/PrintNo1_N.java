//Q8 Write a program to print numbers from 1 to n using recursion.



import java .util.*;
public class PrintNo1_N
{
	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number");
		int n=sc.nextInt();
		
		
		printNumber(n,1);
	}

	
	 public static void printNumber(int n, int i )
	 {
		if(i<=n)
		{
			System.out.print(i+" ");
			printNumber(n,++i);
		}
	 }
}