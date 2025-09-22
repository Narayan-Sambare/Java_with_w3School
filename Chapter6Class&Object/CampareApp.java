/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
public class CampareApp
{
	public static void main(String x[])
	{
		Campare c=new Campare();
		c.checks(5,6);
		
	}
}
class Campare
{
	void checks(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else if(a==b)
		{
			System.out.println("a and b is equal");
		}
		else
		{
			System.out.println("b is greater");
		}
	}
}