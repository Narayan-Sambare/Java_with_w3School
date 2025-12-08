//1. Write a program to input two values using command line argument and perform its swapping?
public class Program1{
	public static void main(String x[]){
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		
		a = a+b;
		b= a-b;
		a=a-b;
		System.out.println("First Number: " + a);
		System.out.println("Second Number: " + b);
	}
}