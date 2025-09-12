package While;
//Q15. Write a java program to print all ASCII characters with their values.

public class CharAtoZ
{
	public static void main(String x[])
	{
		int a='A';
		while(a<='z')
		{
			if(a<=96 && a>=91)
			{
				a++;
				continue;
			}
			else{System.out.println((char)a+"="+a);}
			
			a++;
		}
	}
}