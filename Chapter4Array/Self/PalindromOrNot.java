//Q10.Write a java program to check array is palindrome or not.
import java.util.Scanner;
public class PalindromOrNot
{
	public static void main(String x[])
	{
		Scanner in =new Scanner(System.in);
		int a[]=new int[6];
		int rev[]=new int[6];
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		/*
		int start= 0;
		int end = a.length-1;
		
		while(start<= end){
		  if(a[start] != a[end]){
			  
			  flag= false;
			  break;
		  }
           start++;
            end --;		   
		}
		if(flag)
		{
			System.out.println("Palindrome");	
		}
		else{
			System.out.println("Not Palimdrome");
		
		}
		*/
		
		
		for(int i=0;i<a.length;i++)
		{
			rev[i]=a[a.length-1-i];
		}
			for(int i=0;i<a.length;i++)
			{
			System.out.print(rev[i]+" ");
			}
		for(int i=0;i<a.length/2;i++)
		{
		if(a[i]!=rev[i])
		{
			flag =false;
			break;	
		}
		
		}
		if(flag)
		{
			System.out.println("Palindrome");	
		}
		else{
			System.out.println("Not Palimdrome");
		
		}
		
			
	}
}

		