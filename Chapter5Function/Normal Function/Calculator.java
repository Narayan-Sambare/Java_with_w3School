/*
Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.
*/

import java.util.*;
public class Calculator
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first value :");
		int a=sc.nextInt();
		System.out.println("enter the Second value :");
		int b=sc.nextInt();
		do{
		System.out.println("enter choice :\n 1.add \n 2.subtract \n 3.multiply \n 4.divide \n 5.exit");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("addition of "+a+" and "+b+" is -->"+add(a,b));
				break;
			case 2:
				System.out.println("subtraction of "+a+" and "+b+" is -->"+subtract(a,b));
				break;
			case 3:
				System.out.println("multiply of "+a+" and "+b+" is -->"+multiply(a,b));
				break;
			case 4:
				System.out.println("divide of "+a+" and "+b+" is -->"+divide(a,b));
				break;
				
			default :
				return;
		}
		}while(true);
		
	}
	public static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static int subtract(int a,int b)
	{
		int sum=a-b;
		return sum;
	}
	public static int multiply(int a,int b)
	{
		int sum=a*b;
		return sum;
	}
	public static int divide(int a,int b)
	{
		int sum=a/b;
		return sum;
	}
}
