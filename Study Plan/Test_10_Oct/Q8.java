/*
Q8. Create a POJO class Employee with the following private fields:
    • int id
    • String name
    • double salary
Then, perform the following operations without using any constructor:
1. Use setter methods to assign values to id, name, and salary.
2. Write a method calculateBonus() that returns a bonus amount based on the employee’s
    salary as per the given conditions:
    o If salary ≥ 100000 → bonus = 15% of salary
    o If salary ≥ 50000 and < 100000 → bonus = 10% of salary
    o If salary < 50000 → bonus = 5% of salary
3. Write another method displayEmployeeDetails() that prints:
    o Employee ID
    o Employee Name
    o Salary
    o Bonus (calculated using calculateBonus())
    o Total Compensation (salary + bonus)
4. In the main method, create an object of Employee,
    o set data using setter methods,
    o call calculateBonus() and displayEmployeeDetails() to show all employee information.
*/
import java.util.*;
public class Q8
{
	public static void main(String x[])
    {
		Scanner sc=new Scanner(System.in);
        Servies s = new Servies(); 
		System.out.println("Enter the count of Employees");
        int ec=sc.nextInt(); sc.nextLine();
		Employee e[]=new Employee[ec];
        //Add employees
		s.addEmp(e);
        //display employees
       s.displayEmployeeDetails(e);
	}
	
}
class Employee
{
    private int id;
    private String name;
    private double salary;
        
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
}

class Servies
{
    static Scanner sc=new Scanner(System.in);

    public double calculateBonus(double salary)
    {  
        if(salary >= 100000)
        {
            return (salary*15)/100;
        } 
        else if((salary >= 50000) && (salary < 100000))
        {
           return (salary*10)/100;
        }
        else
        {
            return (salary*5)/100;
        }
    }
    public void displayEmployeeDetails(Employee e[]) 
    {    System.out.println("===========Employee Details ============= ");
        for(int i=0;i<e.length;i++)
        {
            double b=calculateBonus(e[i].getSalary());
            double total=e[i].getSalary()+b;
            System.out.printf("Employee ID: %d\tEmployee Name: %s\t Salary: %d\tBonus: %d\tTotal Compensation: %d",e[i].getId(),e[i].getName(),e[i].getSalary(),b,total );
        }
    }
    public void addEmp(Employee e[])
    {  
        
		for(int i=0;i<e.length;i++)
		{   e[i]=new Employee();
           System.out.println("Enter id,name,salary");
			e[i].setId(sc.nextInt());sc.nextLine();
			e[i].setName(sc.nextLine());
			e[i].setSalary(sc.nextDouble());
		}
	}
}