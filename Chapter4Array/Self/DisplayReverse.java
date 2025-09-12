//Q7. Write a java program to display the reverse array.
import java.util.Scanner;
public class DisplayReverse
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		/*int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		*/
		
		int a[]=new int[5];
		int rev[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		rev[i]=a[a.length-1-i];
		System.out.print(rev[i]+" ");
		}
	}
}