//Q61. Write a menu-driven program in java using switch case.
//           	1.Addition
//          	2.Subtraction
//           	3.Multiplication
//           	4,Division


import java.util.*;
public class Calculator
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :\n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division ");
		int ch=sc.nextInt();
		int a,b, result;
		
		switch(ch)
		{
			case 1:
				System.out.println("Enter 1st number");
				 a=sc.nextInt();
				System.out.println("Enter 2nd number");
				 b=sc.nextInt();
				result=a+b;
				System.out.println("Result = "+ result);
				break;
			case 2:
				System.out.println("Enter 1st number");
				 a=sc.nextInt();
				System.out.println("Enter 2nd number");
				 b=sc.nextInt();
				result=a-b;
				System.out.println("Result = "+ result);
				break;
			case 3:
				System.out.println("Enter 1st number");
				 a=sc.nextInt();
				System.out.println("Enter 2nd number");
				 b=sc.nextInt();
				result=a*b;
				System.out.println("Result = "+ result);
				break;
			case 4:
				System.out.println("Enter 1st number");
				 a=sc.nextInt();
				System.out.println("Enter 2nd number");
				 b=sc.nextInt();
				result=a/b;
				System.out.println("Result = "+ result);
				break;
			default:
				System.out.println("Enter the valid number");
				break;
				
		}
		
	}
}	