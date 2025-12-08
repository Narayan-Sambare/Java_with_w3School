//Q3. Write a java program to check number Is armstrong number or not armstrong using function.

import java.util.*;
public class Q3
{
    public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isArm(n))
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
	}
	public static boolean isArm(int n)
	{  
        int t=n,c=0,sum=0;
        while(t>0){  t/=10; c++;  }
        t=n;
        while (t>0) {
            sum+=(pow(t%10, c));
            t/=10;
        }
        if(sum==n){
            return true;
        }
        else
        {
            return false;
        }
	}
	public static int pow(int n,int c)
	{  
        int p=1;
        for(int i=0;i<c;i++)
        {
            p*=n;
        }
        return p;
	}

}
