/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.


CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.


Explanation:
 Tests inheritance with customized formula calculations.
 */
 
 
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Amount");
		int amount =sc.nextInt();
		System.out.println("Enter the Years");
		int years =sc.nextInt();
		
		
		HomeLoan hl=new HomeLoan(amount,years);
		double emi=hl.emi();
		System.out.println("EMI for amount : "+amount+ " and years :"+years+" with interest rate : "+hl.R);
		System.out.println("EMI : "+emi);
		
		CarLoan cl=new CarLoan(amount,years);
		emi=cl.emi();
		System.out.println("EMI for amount : "+amount+" and years :"+years+ " with interest rate : "+cl.R);
		System.out.println("EMI : "+emi);
		

		
		
	}
}
class Loan
{
	double amount ;
	double years;
	
	public double emi()
	{
		return amount;
	}
}
class HomeLoan extends Loan
{
	double R=7;
	
	HomeLoan(double amount,double years)
	{
		this.amount=amount;
		this.years=years;
	}
	public double emi()
	{	R=(float) R/(12*100);
		int m=(int)years*12;
		double emi = (amount * R * Math.pow(1 + R, m)) / (Math.pow(1 + R, m) - 1);
		return emi;
	}
}
class CarLoan extends Loan
{
	double R=9;
	
	CarLoan(double amount,double years)
	{
		this.amount=amount;
		this.years=years;
	}
	public double emi()
	{	R= R/(12*100);
		int m=(int) years*12;
		double emi = (amount * R * Math.pow(1 + R, m)) / (Math.pow(1 + R, m) - 1);
		return emi;
	}
}


	