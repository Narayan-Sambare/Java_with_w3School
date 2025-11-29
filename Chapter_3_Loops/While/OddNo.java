package While;
//Q5. Write a java program to print all odd numbers between 1 to 100.


public class OddNo
{
	public static void main(String x[])
	{
		int i=0, n=100;
		while(i<=n)
		{
			while(i%2!=0)
			{
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}