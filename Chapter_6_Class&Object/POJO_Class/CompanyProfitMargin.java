/*
5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.
*/
import java.util.*;
public class CompanyProfitMargin
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("how many companys");
		int n=sc.nextInt();
		sc.nextLine();
		Company c[]=new Company[n];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=new Company();
			System.out.println("Enter companyName");
			String cmname=sc.nextLine();
			c[i].setCpName(cmname);
			System.out.println("Enter revenue of company");
			double revenue=sc.nextDouble();
			sc.nextLine();
			c[i].setRevenue(revenue);
			System.out.println("Enter expenses of company");
			double exp=sc.nextDouble();
			sc.nextLine();
			c[i].setExpenses(exp);
		}
		double profit,pftMargin;
		for(int i=0;i<c.length;i++)
		{ 	
			profit=c[i].getRevenue()-c[i].getExpenses();
			if(c[i].getRevenue()!=0)
			{pftMargin=(double)profit/c[i].getRevenue()*100;
			}
			else 
			{
				pftMargin = 0;
			}
			System.out.printf("\t\tCompany name : %s\n Company Revenue : %f\t Company Expenses : %f\n",c[i].getCpName(),c[i].getRevenue(),c[i].getExpenses());
			System.out.printf("Profit :%f\t Profit Margin: %f '%' \n\n",profit,pftMargin);
		}
		
	}
}

class Company
{
	private String cpName ;
	private double revenue;
	private double expenses;
	
		public String getCpName() {	return cpName;}
		public void setCpName(String cpName){
			this.cpName = cpName;
		}
		public double getRevenue(){return revenue;}
		public void setRevenue(double revenue) {
			this.revenue = revenue;
		}
		public double getExpenses(){return expenses;}
		public void setExpenses(double expenses) {
			this.expenses = expenses;
		}

}