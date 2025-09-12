package While;
//Q16. Write a java program to find power of a number.

import java.util.*;
public class PowerOfNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int n=25;
		int b=5;
		int power=0; 
			while(n!=1)
			{
			n=n/b;
			power++;
			}
			System.out.println(power);
			
	}
}	
		
			
	
