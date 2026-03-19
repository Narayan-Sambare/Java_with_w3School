package Test_28_Feb;

//Q6. Write a java program to store N integers in a Vector. Replace all even numbers with 0.
//Input:
//6
//2 5 8 7 10 3
//Output:
//Modified Vector: 0 5 0 7 0 3
//Description:
//Traverse Vector and check modulus condition manually. Replace element using set() method.
import java.util.*;
public class Q6 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		Vector <Integer> st= new Vector<Integer>();
		
		System.out.print("Enter size of vector : ");
		int n=sc.nextInt(); //user input size of vector
		
		
		for(int i=0;i<n;i++){
			System.out.print("Enter "+(i+1)+" element : ");
			st.add(sc.nextInt()); //user input vector element
		}
		
		for(int i=0;i<st.size();i++)
		{
			if(st.get(i)%2==0) // check mod 
			{
				st.set(i,0);// set 0 
			}
		}
		System.out.print("Modified Vector :");
		for(int i:st)
		{
			System.out.print(i+" ");
		}
		
	}
}
