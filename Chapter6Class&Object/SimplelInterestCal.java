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
		SimplelInterestCal si= new SimplelInterestCal();
		System.out.println("Enter the principal");
		int principal=sc.nextInt();
		
		System.out.println("Enter the rate");
		int rate=sc.nextInt();
		
		System.out.println("Enter the time");
		int time=sc.nextInt();
		si.setValue(principal,rate,time);
		si.calSimInt(principal,rate,time);
		
	}
}
class SimpleInterest 
{ 	int result=0;
	int p,t,r;
	void setValue(int principal,int rate,int time )
	{
		p=principal;
		r=rate;
		t=time;
	}
	int calSimInt(int p,int r,int t)
	{
		 result=(p*r*t)/100;
		return result;
	}
}