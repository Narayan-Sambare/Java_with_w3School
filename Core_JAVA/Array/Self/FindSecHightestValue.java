/*
Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/
import java.util.*;
public class FindSecHightestValue
{	public static void main(String x[])
    {	Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.print("Enter "+n+" Array element\n");
		//take input
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
		//find second highest value logic 10 20 50 30 5
		int max=Integer.MIN_VALUE;
		System.out.print(max);
		int SecHig=0;
		for(int i=0;i<a.length;i++)
        {
			if(SecHig<a[i] && max >a[i])
			{
				SecHig=a[i];	
			}	
			
			if(max<a[i])
			{
				max=a[i];//20	
			}
			
        }
		
		System.out.println("highest value-->"+max);
		System.out.println(" Second highest value-->"+SecHig);
    }
}