package While;
/*
Q24. Write a java program to Check Number Is Strong Number or Not.
 Example : A strong number is one in which the factorial of the
 digits equals the number itself. 1, 2, 145,
*/
import java.util.*;
public class StrNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int tem=n;
		int f=1,Fact=0;
		while(n>0)
		{
		int rem=n%10;
		n=n/10;
		while(rem>0)
		{
			f=f*rem;
			rem--;
		}
		Fact=Fact+f;
		f=1;
		}
		n=tem;
		String str= n==Fact? "Strong number":"not strong number";
		System.out.println(str);
		
	}
}