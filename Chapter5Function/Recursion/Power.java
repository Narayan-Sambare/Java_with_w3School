//Write a program to calculate the power of a number (x^n) using recursion.

//function code
import java .util.*;
public class Power
{  static int result=1;
	int i=0; 
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base=sc.nextInt();
		
		System.out.println("Enter the index");
		int idx=sc.nextInt();
		Power p=new Power();
		int a=p.findPow(base,idx);
		System.out.println("power :"+a);
		result=base;
	}
	 public int findPow(int base,int idx)
	 {
		 if(i==idx)
		 {
		 return result;
		 }else
		 {	result=result*base;
			i++;
			return findPow( base,idx);
		 }
	 }
}