package While;
//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop


import java.util.*;
public class EvenNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0,n=100;
		while(i<=n)
		{
			while(i%2==0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}
