/*
2. Employee Salary Increment
Task:
Create an Employee class with fields: name, salary, and department.
In the main method:
Create an Employee object.
Increase the employee's salary by 10% and print the updated salary.
Explanation:
This introduces instance variable manipulation and basic arithmetic operations.
*/
import java.util.*;
public class EmployeeManagement
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee number");
		int n=sc.nextInt();
		sc.nextLine();
		
		Employee emp[]=new Employee[n];
		
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter Name of "+(i+1)+" Employee");
			String name=sc.nextLine();
			emp[i].setName(name);
			
			System.out.println("Enter Salary of "+(i+1)+" Employee");
			int s=sc.nextInt();
			emp[i].setSalary(s);
			sc.nextLine();
			
			System.out.println("Enter Department of "+(i+1)+" Employee");
			String d=sc.nextLine();
			emp[i].setDepartment(d);
		}
		for(int i=0;i<emp.length;i++)
		{	int news=(emp[i].getSalary())/10;
			System.out.println("old Salary of "+(i+1)+" emp:-->"+emp[i].getSalary());
			emp[i].setSalary(emp[i].getSalary()+news);
			System.out.println("new Salary of "+(i+1)+" emp:-->"+emp[i].getSalary());
			
		}		
	}
}
class Employee{
	private String name;
	private int salary;
	private String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}