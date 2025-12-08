import java.util.*;
public class Employee_Payroll_System 
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many Employees work in company :");
        int n=sc.nextInt();
        Employee emp[]=new Employee[n];
        for(int i=0;i<emp.length;i++)
        {                       
            System.out.println(" Enter id of Emp :");
            int id=sc.nextInt();
            System.out.println(" Enter name of Emp :");sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter salary of emp :");
            double salary=sc.nextDouble();
            System.out.println("1.Manager\n2.Developer\n3.Intern");
            int ch =sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter team Size :");
                    int teamSize=sc.nextInt();
                    emp[i]=new Manager(id, name, salary, teamSize);
                    break;
                case 2:
                    System.out.println("Enter how many project completed :");
                    int project=sc.nextInt();
                    emp[i]=new Developer(id, name, salary,project);
                    break;
                case 3: 
                    emp[i]=new Intern(id, name, salary);
                    break;

                default:
                    System.out.println("Enter valid input");
                    emp[i]=null;
                    i--;
                    break;
            }
        }
        
    }
}

class Employee
{
    private int  id;
    private String name;
    private double baseSalary;

    public double getSalary()
    {
        return baseSalary;
    }

    public double getName()
    {
        return baseSalary;
    }
    Employee(int id, String name, double baseSalary)
    {
        this.id =id ;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    double calculateSalary()
    {
        return baseSalary;
    }

}
class Manager extends Employee
{    
    double Allowance=0;
    double Bonus=0;
    int teamSize;
    Manager(int id, String name, double baseSalary,int teamSize)
    {
        super(id,name,baseSalary);
        this.teamSize=teamSize;
    }
    double calculateSalary()
    {
        double baseSalary=getSalary();
        Allowance=baseSalary*0.40;
        if(teamSize>10)
        {
            Bonus=1000;
        }
        return baseSalary+Allowance+Bonus;
    }
    void maxSalary(Employee emp[])
    {
        double ms=0;int msi=0;
        double salary=0;
        int c=0;
        for(int i=0;i<emp.length;i++)
        {
            double salary1=emp[i].getSalary();
            salary=emp[i].calculateSalary();
            if(salary>60000)c++;
            if(salary<ms)
            {
                ms=salary;
                msi=i;
            }
        }
        System.out.println(emp[msi].getName()+"Max Salary is :"+ms);
        System.out.println("Total "+c+" Employees earmn above 60000");
    }

}
class Developer extends Employee
{
    double Allowance=0;
    int project=1;
    Developer(int id, String name, double baseSalary,int project)
    {
        super(id,name,baseSalary);
        this.project=project;
    }
    double calculateSalary(double baseSalary)
    {
        Allowance=baseSalary*0.30;
        project*=2000;
        
        return baseSalary+Allowance+project;
    }    
}
class Intern extends Employee
{
    double Stipend=0;
    Intern(int id, String name, double baseSalary)
    {
        super(id,name,baseSalary);
    }
    double calculateSalary(double baseSalary)
    {
        Stipend=baseSalary*0.50;        
        return baseSalary+Stipend;
    }   
}
