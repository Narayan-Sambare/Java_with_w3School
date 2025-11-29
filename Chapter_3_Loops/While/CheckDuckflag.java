package While;
/*
 Write a java program to check Duck Number without flag.
*/

import java.util.*;
public class CheckDuckflag
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
			while(n>0)
			{
				int rem=n%10;
				 n=n/10;
				if(rem==0)
				{
					System.out.println("duck");
				}	
                else{
                    System.out.println(" not duck");
                }
			}		
		
	}
}

