//Q3. Write a Java program to find the kth largest element in an array without sorting.
//Input:
//Enter size: 6
//Enter elements: 10 45 23 67 34 67
//Enter k value: 2
//Output: Second largest element is 45


package Test_23_March;

import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
//		System.out.println("Enter Size of Array :"); // for size of array
//		int n=sc.nextInt();
//		int a[]=new int [n];
//		
//		for(int i=0;i<a.length;i++) // for get user array value 
//		{
//			System.out.println("Enter "+(i+1)+" value in Array :");
//			a[i]=sc.nextInt();
//		}	
//		System.out.println("Enter k value :"); //for get  k th value form user 
//		int k=sc.nextInt(); 
		int a[]= {10, 45, 23,67, 34, 67};
		int k=2; 
		int kmax=a[0]; 
		int kmidx=0;
		
		if(k>a.length-1) // for verify the user k value is less than array size 
		{
			System.out.print("please enter valid k  value :");
		}
		
		for(int i=0;i<k;i++) //for k time repeation
		{
			for(int j=0;j<a.length;j++) // find the max value each time 
			{
				
				if(kmax<a[j])
				{
					kmax=a[j];
					kmidx=j;
				}
				else if(kmax<=a[j] && k>=1) //for skip dublicate value
				{
					a[j]=0;
				}
				
			}
			if(k==i+1)  //print the max value from array
			{
				System.out.println("K th max value is :"+kmax);
			}
			a[kmidx]=0; // remove the max form array
			kmax=0;    
			kmidx=0;
		}
	}

}
