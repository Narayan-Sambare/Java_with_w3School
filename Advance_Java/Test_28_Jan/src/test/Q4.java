package test;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size ");
		int n=sc.nextInt();
		System.out.println("Enter value");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int target =sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<k;j++)
			{
				sum+=a[j];
			}
			for(int j=k;j<n;j++)
			{
				sum+=a[j]-a[j-k];
				if(sum>=target)
				{
					
					System.out.println("Size is :"+k);
					return;
				}
			}
			k++;
				
		}
	}

}
