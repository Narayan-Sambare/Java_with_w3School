//Q6 Write a program to find the greatest common divisor (GCD) of two numbers using recursion.

//function code
import java .util.*;
public class GCD
{
	static int gcd=0,i=1;
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		
		
		int a=fgcd(n1,n2);
		System.out.printf("gcd of %d and %d is %d",n1,n2,gcd);
	}

	
	 public static int fgcd(int n1,int n2)
	 {
		if(n1==i)
		{
			return gcd;
		}
		else{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
			i++;
			return fgcd(n1,n2);
		}
	 }
}