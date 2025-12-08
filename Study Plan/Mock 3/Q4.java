//am to display following series using function recursion.
// 1 4 9 16 25 36 49 64 81 100
//function code
import java .util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("first Number");
		int f=sc.nextInt();
		System.out.println("last Number");
		int n=sc.nextInt();
		System.out.println("difference between 2 Number");
		int d=sc.nextInt();
		printSeries(f,n,d);
	}

	
	 public static void printSeries(int f,int n ,int d)
	 {
		if(f>=n)
        {   System.out.print(f+" ");
            return;
        }
		System.out.print(f+" ");
        printSeries(f+d,n,d+2);
	 }
}