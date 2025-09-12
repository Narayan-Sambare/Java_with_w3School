//Q6. Write a java program to search element in array , its element found or not.
import java.util.Scanner;
public class FindElement
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter target to search");
		boolean flag=false;
		int target=in.nextInt();
		System.out.println("Enter array elemnts");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Element found");
		}
		else
			System.out.println("Not found");
	}
}
		
		