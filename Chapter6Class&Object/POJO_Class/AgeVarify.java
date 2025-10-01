/*
3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/
import java.util.*;
public class AgeVarify
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of person ");
		int n=sc.nextInt();
		sc.nextLine();
		Person p[]=new Person[n];//create array object
		
		for(int i=0;i<p.length;i++)
		{	p[i]=new Person();//create object of each person
			System.out.println("Enter name and age");
			String name=sc.nextLine();
			int age=sc.nextInt();
			sc.nextLine();
			p[i].setName(name);
			p[i].setAge(age);
		}
		
	
		for(int i=0;i<p.length;i++)
		{	
			if(p[i].getAge()>=18)	
			{
				System.out.println("Name: "+(p[i].getName())+" Age: "+(p[i].getAge()));
			}
		}
			
	}
	
}

class Person
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}