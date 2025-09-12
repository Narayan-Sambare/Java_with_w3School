//Swap first and last digit of number

import java.util.*;
public class SwapFLDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=12345;
		int temp=n;
		int a=1;	
		while(n>10)
		{
			n=n/10;
			a*=10;
		}
		n=temp;
		int last = n%10;
		int first=n/a;
		int mid=n%a-last;
		System.out.println("Swap number: "+(last*a+mid+first));		
	}
}
		
		