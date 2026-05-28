
import java.util.*;

public class Reverse{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		sc.nextLine();
		String str[] =new String[n];
		System.out.println("Enter the words in arrays");
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}
	}
}