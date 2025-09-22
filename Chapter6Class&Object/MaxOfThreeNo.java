/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/

import java.util.*;
public class MaxOfThreeNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first numbers");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second numbers");
		int n2=sc.nextInt();
		
		System.out.println("Enter the third numbers");
		int n3=sc.nextInt();
		
		MaxFinder fm=new MaxFinder();
		fm.findMax(n1,n2,n3);
		
	}
}
class MaxFinder
{
	void findMax(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println("first numbers is max : "+a);
		}
		else if(a<b&&b>c)
		{
			System.out.println("Second numbers is max :"+b);
		}
		else if(a<c&&b<c)
		{
			System.out.println("Third number is max : "+c);
		}
		else if(a==b && a>c)
		{
			System.out.println("first  and second number equal max is "+a);
		}
		else if(a==c && a>b)
		{
			System.out.println("first  and third number equal  max is "+c);
		}
		else
		{
			System.out.println("second and third number equal max is "+b);
		}
	}
}
		