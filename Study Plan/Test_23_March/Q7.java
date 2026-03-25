//Q7. Write a program to enter the String and sum of the all Digits in a given String
// input : abcd123pqe12mn12abc
// output is Sum is 147
// (note sum of number is 123+12+12 =147)

package Test_23_March;
import java.util.*;
public class Q7 {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
//	System.out.println("Enter String :");
//	String s=sc.nextLine();
		
	String s="abcd123pqe12mn12abc";
	String num=" ";
	int sum=0;
	boolean flag=false;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c<='z' && c>='a' ||c<='Z' && c>='A') //check 
		{
			flag=false;
			num="";
			
		}else{
			
			num+=c;
			flag=true;
		}
		
		// next letter is char and add num into sum
		if(flag && (s.charAt(i+1)<='z' && s.charAt(i+1)>='a' ||s.charAt(i+1)<='Z' && s.charAt(i+1)>='A') )
		{
			String newNum=num.trim();
			sum+=Integer.parseInt(newNum);
		}
	}
	System.out.println("Sum is :"+sum);
	
	
	}
}
