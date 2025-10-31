// Q1. Problem:
//  Create a class Employee with fields:
// empId, empName, basicSalary, hra, da, and grossSalary.
// Use a parameterized constructor to initialize empId, empName, and basicSalary.
//  HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
//  Display all employee details and salary slip.
// Hint: Use constructor to calculate the salary.
// Explanation:
//  This helps you understand how constructors can perform initial calculations immediately after object creation.
class Employee
{
    int empId,basicSalary,hra,da,grossSalary;
    String empName;
    Employee(int empId,String empName,int basicSalary)
    {
        this.empId=empId;
        this.empName=empName;
        this.basicSalary=basicSalary;
    }
    int calGrossSalary()
    {
        hra=(basicSalary*10)/100;
        da=(basicSalary*15)/100;
        grossSalary=basicSalary+hra+da;
        return grossSalary;
    }

}
public class Q1
{
    public static void main(String x[])
    {
        Employee emp=new Employee(1, "sanket", 15000);
        int result=emp.calGrossSalary();
        System.out.println("Gross Salary is "+result);
        
    }
}