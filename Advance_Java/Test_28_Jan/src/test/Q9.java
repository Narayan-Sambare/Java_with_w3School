//Q9. Write a program using ArrayListto store exam marks ofstudents. Take a numberfrom the user
//and count how many times it appears in the list.
//Explanation:
//• Store marksin an ArrayList.
//• Traverse the list using a loop.
//• Compare each element with the user input and maintain a count.

package test;
import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> marks=new ArrayList();
		System.out.println("enter subjet count");
		int sub=sc.nextInt();
		
		for(int i=0;i<sub;i++)
		{
			System.out.println("enter subject "+(i+1)+" marks");
			marks.add(sc.nextInt());
		}
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int count=0;
		for(int i:marks)
		{
			if(n==i)
			{
				count++;
			}
		}
		System.out.println(marks);
		System.out.println("number "+n+" count is : "+count);
	}

}
