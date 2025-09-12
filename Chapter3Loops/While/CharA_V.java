package While;
//Q15. Write a java program to print all ASCII characters with their values.

public class CharA_V
{
	public static void main(String x[])
	{
		int i='A';
		
		while(i<='z')
		{
			char c=(char)i;
			System.out.println(c+" = "+i);
			i++;
		}
	}
}