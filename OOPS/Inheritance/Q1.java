/*Q1.Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.

1.Developer gets a 10% bonus.
2.Write a program to calculate and display the total salary (base + bonus) for each employee.
 */
public class Q1{
    public static void main(String x[])
    {
        Manager mg=new Manager();
        mg.setValue("Sanket", 20000);
        double tsalary=mg.calculateTotalSalary();
        System.out.println("Total salary of Manager :"+tsalary);

        Developer dev=new Developer();
        dev.setValue("Khushal", 15000);
        double ttsalary=dev.calculateTotalSalary();
        System.out.println("Total salary of developer :"+ttsalary);
    }
}
class Employee
{
    String name;
    double salary;

   void setValue(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    double calculateTotalSalary(){
        return salary;
    }
}
class Manager extends Employee
{

    double calculateTotalSalary()
    {
        return salary + (salary * 20) / 100;
    }
}
   
class Developer extends Employee
{
    
    double calculateTotalSalary(){
        return salary+(salary*10)/100;
    }
}
