package While;
/*
Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.

square of number and sum of square digit is same 
ex. 9 square 81 sum of square digit is 8+1=9
*/
import java.util.*;
public class CheckNeon
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int check=0;
		int sq=n*n;
		while(sq>0)
		{
			int rem=sq%10;
			sq=sq/10;
			check=check+rem;
		}
		String s=check==n?"Neon":"not Neon";
		System.out.println(s);
	}
}