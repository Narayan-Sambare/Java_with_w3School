package While;
/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of 
steps where in each step number is replaced by the sum of squares of its digit,
that is if we start with Happy Number and keep replacing it with digits 
square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/
import java.util.*;
public class HappyNum
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n=sc.nextInt();
		int n=19,sq=0;
		boolean flag=false;
		while(n>9)
		{
			while(n>0)
			{
				int rem=n%10;
				System.out.println("rem-->"+rem);
				n=n/10;
				System.out.println("n-->"+n);
				sq=sq+(rem*rem);
				System.out.println("sq-->"+sq);
				if(sq>=1)
				{	
					flag=true;
					break;
				}
				
			}
			n=sq;
			
			if(flag)
			{		
				System.out.println("happy number"+n);
			}
			else{
					System.out.println(" not happy number"+n);
			}					
				
		}
		
	}
}
			