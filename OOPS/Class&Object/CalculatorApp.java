/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. 
Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

public class CalculatorApp
{
	public static void main(String x[])
	{
		Calculator c=new Calculator();
		c.add(5,6);
		c.subtract(5,6);
		c.multiply(5,6);
		c.divide(5,6);
	}
}
class Calculator
{ 	int result=0;
	void add(int a,int b)
	{
		result=a+b;
		System.out.println("Addition of a and b is-->"+result);
	}
	void subtract(int a,int b)
	{
		result=a-b;
		System.out.println("subtraction of a and b is-->"+result);
	}
	void multiply(int a,int b)
	{
		result=a*b;
		System.out.println("multiplication of a and b is-->"+result);
	}
	void divide(int a,int b)
	{
		result=a/b;
		System.out.println("division of a and b is-->"+result);
	}
}