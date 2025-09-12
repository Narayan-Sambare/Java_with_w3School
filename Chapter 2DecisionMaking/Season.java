// Q59. Write a program using switch that takes a number (1-4) and displays a season:
//  1: Spring
//  2: Summer
//  3: Autumn
//  4: Winter

import java.util.*;
public class Season
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :\n 1: Spring \n 2: Summer \n 3: Autumn \n 4: Winter ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Spring");
				break;
			case 2:
				System.out.println("Summer");
				break;
			case 3:
				System.out.println("Autumn");
				break;
			case 4:
				System.out.println("Winter");
				break;
				
			default:
				System.out.println("Enter the valid number");
				break;
				
		}
		
	}
}	