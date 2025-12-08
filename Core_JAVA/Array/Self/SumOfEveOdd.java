//Q8. Write a java program to calculate the sum of even or odd numbers.
import java.util.Scanner;
public class SumOfEveOdd
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
			sum+=a[i];
			}
		}
		System.out.println("even number sum is: "+sum);
		sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2 !=0)
			{
			sum+=a[i];
			}
		}
				System.out.println("odd number sum is: "+sum);
	}
}