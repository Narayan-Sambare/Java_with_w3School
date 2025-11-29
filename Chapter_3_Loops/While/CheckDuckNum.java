package While;
/*Q23. Write a java program to Check Number Is Duck Number or Not.
the digit 0 can appear in any position of a number except the first position
*/
import java.util.*;
public class CheckDuckNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean f=true;
		int rem=0;
		if(n==0)
		{
			System.out.println("enter valid number");
		}
		while(n>0)
		{   rem=n%10;
			n=n/10;
			if(rem==0)
			{   f=false;
				break;
			}			
		}
		if(f==false)
			{  System.out.println("Duck number"); }
		else{  System.out.println("Not duck number"); }
			
	}
}		
