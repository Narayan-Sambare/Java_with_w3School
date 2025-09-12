// Q56. Create a Java program using switch to convert a given number 
// (1-5) to its word equivalent (One, Two, ..., Five). If the number
// is not between 1 and 5, display “Invalid number.

import java.util.*;
public class NumberToWords
	{   
		public static void main(String x[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int a=sc.nextInt();
			
			switch(a)
			{
				case 1:
					System.out.print("one");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				
				default:
					System.out.print("invalid input");
					break;
			}	
			
		}
	}
		
