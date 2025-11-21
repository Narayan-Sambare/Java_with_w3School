/*
Q5. Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3)
*/
import java.util.*;
public class Q5
{	
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting number:");
		int a=sc.nextInt();
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		priSeries(a,n);
	}
	
	public static void priSeries(int a,int n)
	{
			while(n!=0)
			{
				System.out.print(a+" ");
				a = a*2;				
				n--;
			}
	}
}