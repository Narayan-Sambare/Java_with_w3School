/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.

*/
import java.util.*;

public class SimpleInterestCal
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		SimpleInterest si= new SimpleInterest();
		System.out.println("Enter the principal");
		int principal=sc.nextInt();
		
		System.out.println("Enter the rate");
		int rate=sc.nextInt();
		
		System.out.println("Enter the time");
		int time=sc.nextInt();
		
		//si.setValue(principal,rate,time);
		int result=si.calSimInt(principal,rate,time);
		System.out.println("Simple interest : "+result);
		
	}
}
class SimpleInterest 
{ 	int  result=0;
	int calSimInt(int principal,int rate,int time )
	{
		 result=(principal*rate*time)/100;
		return result;
	}
}