//Q8. Write a program that maintains a Vector of city names. Perform the following:
//1. Insert 5 cities.
//2. Remove the city at index 3.
//3. Insert a new city at index 1.
//4. Display final list.
package test;

import java.util.*;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		v.add("pune");
		v.add("shegaon");
		v.add("jalgaon");
		v.add("nashik");
		v.add("nagpur");
		System.out.println("5 city is added");
		System.out.println("=================================================");
		do {
			System.out.println("1.insert city\n2.Remove the city using index \n3.Insert a new city using index\n4.Display final list\n5.exit");
			int ch =sc.nextInt();sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println("Enter city name");
				String city=sc.nextLine();
				v.add(city);
				System.out.println("City added");
				System.out.println("=================================================");
				break;
			case 2:
				System.out.println("enter index ");
				int idx=sc.nextInt();
				v.remove(idx);
				System.out.println("City remove");
				System.out.println("=================================================");
				break;
			case 3:
				System.out.println("enter index ");
				idx=sc.nextInt();sc.nextLine();
				System.out.println("Enter city name :");
				city=sc.nextLine();
				v.add(idx, city);
				System.out.println("=================================================");
				break;
			case 4:
				int i=0;
				for(Object obj:v)
				{
					System.out.println(i+":"+obj);
					i++;
				}
				System.out.println("=================================================");
				break;
			case 5:
				return ;
				default:
					System.out.println("enter valid input ");
					System.out.println("=================================================");
					break;
			}
		}while(true);
			
		
		
	}

}
