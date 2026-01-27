/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that
checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
public class TwoNumberComparison
{
	public static void main(String x[])
	{
		Campare c=new Campare();
		
		c.checks(5,6);
		
	}
}
class NumberComparison
{
	void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a==b)
		{
			System.out.print("a and b is equal");
		}
		else
		{
			System.out.print("a is less than b ");
		}
	}
}