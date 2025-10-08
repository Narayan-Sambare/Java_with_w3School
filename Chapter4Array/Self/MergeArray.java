//Q9. Write java program to merge two array and display it.
import java.util.Scanner;
public class MergeArray
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[8];
		int c[]=new int[a.length+b.length];
		System.out.println("Enter values of array first");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
			c[i]=a[i];
		}
				
		System.out.println("Enter values of array second");	
		for(int i=0;i<b.length;i++)
		{
			b[i]=in.nextInt();
			c[i+(a.length)]=b[i];
		}
		
		for(int i=0;i<(a.length+b.length);i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}
		
		
		