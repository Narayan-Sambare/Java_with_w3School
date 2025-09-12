package While;
/*
Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/
import java.util.*;
public class SpyNum
{
	public static void  main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	
		int sum=0,pro=1;
		while(n>0)
		{
			int ld=n%10;
			n=n/10;
			sum=sum+ld;
			pro=pro*ld;
		}
		String s=pro==sum?"Spy number":"not spy number";
		System.out.println(s);
	}
}
			
			