/*
Q2. Problem:
Create a POJO class Employee with fields: empId, name, basicSalary, hra, and da.

Store details of 5 employees using an array of objects. Perform the following operations:

1.Calculate the gross salary for each employee (gross = basic + hra + da).

2.Find and display the employee with the maximum salary.

3.Print the details of employees whose salary is greater than the average salary of all employees.


Explanation:
This covers aggregation + comparison + filtering. You’ll work with numerical calculations and finding max/average values.
*/

import java.util.*;

class Employee {
    private int empId;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public double getDa() {
        return da;
    }
    public void setDa(double da) {
        this.da = da;
    }

    public double getGrossSalary() {
        return basicSalary + hra + da;
    }
}

public class EmployeeSalary
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee count");
		int count=sc.nextInt();
        Employee emp[] = new Employee[count];

        
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of "+(i + 1)+" Employee ");
            //System.out.println("EmpId: ");
            emp[i].setEmpId(sc.nextInt());

            System.out.println("Name: ");
            emp[i].setName(sc.next());

            System.out.println("Basic Salary: ");
            emp[i].setBasicSalary(sc.nextDouble());

            System.out.println("HRA: ");
            emp[i].setHra(sc.nextDouble());

            System.out.println("DA: ");
            emp[i].setDa(sc.nextDouble());
        }

        double totalGross = 0;
        double maxGross = 0;
        int maxIndex = 0;

        System.out.println("\n---- Gross Salary of Each Employee -------\n");
        for (int i = 0; i < emp.length; i++)
		{
            double gross = emp[i].getGrossSalary();
            System.out.println("EmpId: "+ emp[i].getEmpId()+"\n Name: " + emp[i].getName()+"\n Gross Salary: " + gross);
            totalGross += gross;
            if (gross > maxGross)
			{
                maxGross = gross;
                maxIndex = i;
            }
        }

        // Employee with Maximum Salary
        System.out.println("\n---- Employee with Maximum Salary ----");
        System.out.println("\n EmpId: " + emp[maxIndex].getEmpId()+"\n Name: " + emp[maxIndex].getName() +"\n Gross Salary: " + maxGross);

        // Average Salary
        double avgGross = totalGross / emp.length;
        System.out.println("\nEmployees with Salary Greater than Average " + avgGross );
        for (int i = 0; i < emp.length; i++) 
		{
            if (emp[i].getGrossSalary() > avgGross)
			{
                System.out.println("\nEmpId: " + emp[i].getEmpId()+"\n Name: " + emp[i].getName()+"\n Gross Salary: " + emp[i].getGrossSalary());
            }
        }
    }
}
