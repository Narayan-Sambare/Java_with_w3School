//Q3. Write a java program to Check If a Number Is a Neon Number or Not Neon number using
//function recursion. 9 sum of square of num is == sum

package test;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		int result= isNeon(n,0);
		System.out.print(result==n?"neon":"not neon");
	}
	public static int isNeon(int n,int op)
	{
		if(op==1)
		{
			return n;
		}
		int sq=n*n;
		int a=sq%10;
		int b=sq/10;
		return isNeon(a+b,++op);
		
	}

}
