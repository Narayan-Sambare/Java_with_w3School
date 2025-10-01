//Q16. Write a program to print the digits of a number in reverse order using recursion.\

import java .util.*;
public class PrintReverseNu
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		PrintReverseNu s=new PrintReverseNu();
		s.printRev(n);
		
	}
	 public void printRev(int n)
	 {		if(n==0)
			 {
				 return;
			 }else
			 {  System.out.print(n%10+" ");
				printRev(n/10);
			 }
	 }
}