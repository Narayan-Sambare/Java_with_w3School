//Q60. Create a Java program to simulate a basic food ordering system using switch:
// 1: Burger
// 2: Pizza
// 3: Pasta
// 4: Sandwich
//  Display the price for the selected item.
// Explanation:
// Switch on food item number. Print item name and price. Default for invalid selection.

import java.util.*;
public class Food
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :\n 1: Burger \n 2: Pizza \n 3: Pasta \n 4: Sandwich ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Food Name:- Regular Burger Price:-100$ /1 p");
				System.out.println("Food Name:- Veg Burger Price:-80$ /1 p");
				System.out.println("Food Name:- NON-Veg Burger Price:-150$ /1 p");
				break;
			case 2:
				System.out.println("Food Name:- Regular Pizza Price:-80$ /1 p");
				System.out.println("Food Name:- Veg Pizza Price:-100$ /1 p");
				System.out.println("Food Name:- NON-Veg Pizza Price:-120$ /1 p");
				break;
			case 3:
				System.out.println("Food Name:- Regular Pasta Price:-80$ /1 p");
				System.out.println("Food Name:- masala  Pasta Price:-100$ /1 p");
				System.out.println("Food Name:- Butter Pasta Price:-120$ /1 p");
				break;
			case 4:
				System.out.println("Food Name:- Regular Sandwich Price:-50$ /1 p");
				System.out.println("Food Name:- Veg Sandwich Price:-60$ /1 p");
				System.out.println("Food Name:- NON-Veg Sandwich Price:-80$ /1 p");
				break;
			default:
				System.out.println("Enter the valid number");
				break;
				
		}
		
	}
}	