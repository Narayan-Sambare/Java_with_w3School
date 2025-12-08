// Q62. Write a menu-driven program in java using switch case.
// 1.Check Number is positive , negative or zero.
// 2.Check Number is even or odd.
// 3.Write a c program to find the max number using 2 numbers.

import java.util.*;
public class MenuFor61Q
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Check Number is positive , negative or zero\n 2.Check Number is even or odd\n 3.find the max number using 2 numbers");
		int ch= sc.nextInt();
		int a,b,c;
		switch(ch)
		{
			case 1:
				System.out.println("Enter the number");
				a=sc.nextInt();
				
			
				if(a>0)
				{
					System.out.println(a+ " is Positive");
				}
				else if(a<0)
				{
					System.out.println(a+ " is Negative");
				}
				else
				{
					System.out.println(a+ " is Zero");
				}
				break;
			case 2:
				System.out.println("Enter the number");
				a=sc.nextInt();
							
				if(a%2==0)
				{
					System.out.println(a+ " is Even");
				}
				else
				{
					System.out.println(a+ " is Odd");
				}
				break;
			case 3:
				System.out.println("Enter the 1st number");
				a=sc.nextInt();
				System.out.println("Enter the 1st number");
				b=sc.nextInt();
			
				if(a>b)
				{
					System.out.println(a+ " is MAX (greater)");
				}
				else
				{
					System.out.println(b+ " is MAX (greater)");
				}
				break;
			
			default:
				break;
		}
			
	}
}