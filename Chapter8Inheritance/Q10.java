/*
10. Question:
 Create base class Employee with method calculateBonus().
PermanentEmployee bonus = 25% of salary.


ContractEmployee bonus = 10% of salary.
 Print bonus using a common reference to demonstrate runtime polymorphism.


Explanation:
 Tests dynamic method dispatch where base-class reference holds subclass objects.
*/
 
import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter the Employee name");
		String name=sc.nextLine();
		System.out.println("Enter salary of Employee");
		int salary =sc.nextInt();
		
		
		PermanentEmployee pe=new PermanentEmployee(name,salary);
		double bonus=pe.calculateBonus();
		System.out.println("Employee name : "+name+" and salary :"+salary);
		System.out.println("bonus : "+bonus);
		System.out.println("total salary : "+(bonus+salary));
		
		ContractEmployee ce=new ContractEmployee(name,salary);
		bonus=ce.calculateBonus();
		System.out.println("Employee name : "+name+" and salary :"+salary);
		System.out.println("bonus : "+bonus);
		System.out.println("total salary : "+(bonus+salary));
	}
}
class Employee
{
	String name;
	int salary;
	
	public double calculateBonus()
	{
		return salary;
	}
}
class PermanentEmployee extends Employee
{
	
	PermanentEmployee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public double calculateBonus()
	{
		return (salary*25)/100;
	}
}
class ContractEmployee extends Employee
{
	ContractEmployee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public double calculateBonus()
	{
		return (salary*10)/100;
	}
}


	