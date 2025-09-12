/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
n=153= calculate the number power ---153 power is 3 
then calculat a=1^3+5^3+3^3
n==a mins Armstrong 
*/
import java.util.*;
public class Armstrong
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int tem=n,f=0,count=0;
		while(n>0)
		{
			n=n/10;
			count++;// count the number of digit mins the power
		}
		n=tem;// n value was change so re enter the original value of n
		while(n>0)
		{	int rem=n%10; //find last digit
			n=n/10; // to reduce the last one digit
			int a=(int)Math.pow(rem,count); //calculat the (3^3)
			f=f+a; //add all power calculation
		}
		String s=f==tem?"yes "+tem+" is Armstrong number":"No "+tem+" is Not Armstrong number"; 
		System.out.println(s);
	}
}