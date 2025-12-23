/*
Q2. Write a menu driven program in java to Create a class name as Employee to hold empid, empname , empemail , empcontact and empsalry.
			
The menu options should be: 
		
	1. Add Employee Details.
	2. Display All Employee Details.\
	3. Search Employee By Id then employee is found or not.
	4. Update Employee Details By Name.
	5. Delete Employee Details By Email.
	6. Display list count of the Employee in Company.
	7. Display list the employee in the ascending order of employee salary.
	8. Display the employee details in highest salary.
	9. Display the employee details in minimum salary is 10000 to maximum salary is 60000.
	10. Exit.
*/
import java.util.*;
public class EmployeeManagement
{	
	static Scanner sc=new Scanner(System.in);
	public static void main(String x[])
	{	
		System.out.println("Enter the Employee count");
		int count=sc.nextInt();
		Employee emp=new Employee();
		do
		{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("\n1. Add Employee Details");
			System.out.println("2. Display All Employee Details");
			System.out.println("3. Search Employee By Id then employee is found or not");
			System.out.println("4. Update Employee Details By Name");
			System.out.println("5. Delete Employee Details By Email");
			System.out.println("6. Display list count of the Employee in Company");
			System.out.println("7. Display list the employee in the ascending order of employee salary");
			System.out.println("8. Display the employee details in highest salary");
			System.out.println("9. Display the employee details in minimum salary is 10000 to maximum salary is 60000");
			System.out.println("10. Exit The Code");
			System.out.println("-----------------------------------------------------------------------");
			int ch=sc.nextInt();sc.nextLine();
			
			switch(ch)
			{
				case 1:
					emp.addEmp(count);
					break;
				case 2:
					emp.showEmp();					
					break;
				case 3:
					emp.searchEmpId();
					break;
				case 4:
					emp.updateEmpByName();
					break;
				case 5:				
					emp.deleteEmpByEmail();
					break;
				case 6:
					emp.displayEmpCount();
					break;
				case 7:
					emp.displayEmpAscending();
					break;
				case 8:
					emp.disEmpDataInHighSalarya();
					break;
				case 9:
					emp.disEmpDataSalRange();
					break;
					
				default:
					return;
			}
			
		}while(true);
	}
}

class Employee
{	
    private int empId;
    private String empName;
    private String empMail;
    private long empContact;
    private int empSalary;
	private Employee emp[];

    static Scanner sc=new Scanner(System.in);
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int id) {
        this.empId = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getEmpMail() {
        return empMail;
    }
    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }
    public long getEmpContact() {
        return empContact;
    }
    public void setEmpContact(long empContact) {
        this.empContact = empContact;
    }
    public int getEmpSalary() {
        return empSalary;
    }
	public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
	
	public void addEmp(int count )
	{ 				
	System.out.println("-----------------------------------------------------------------------");
					Employee ep[]=new Employee[count];
					for (int i = 0; i< ep.length; i++) 
					{
						ep[i] = new Employee();
						System.out.println("\nEnter details of "+(i+1)+" Employee");

						System.out.print((i+1)+" Employee ID: ");
						ep[i].setEmpId(sc.nextInt());sc.nextLine();
						
						System.out.print((i+1)+" Employee Name: ");
						ep[i].setEmpName(sc.nextLine());

						System.out.print((i+1)+" Employee Email: ");
						ep[i].setEmpMail(sc.nextLine());

						System.out.print((i+1)+" Employee contact: ");
						ep[i].setEmpContact(sc.nextLong());sc.nextLine();
						
						System.out.print((i+1)+" Employee Salary: ");
						ep[i].setEmpSalary(sc.nextInt());sc.nextLine();
						
			System.out.println("-----------------------------------------------------------------------");
						
					}
					
			emp=ep;
	}
	public void showEmp()
	{
		System.out.println("-----------------------------------------------------------------------");
			System.out.println("Employee Detail:-");
			for (int i = 0; i< emp.length; i++) 
			{
				if(emp[i]!=null)
				{
					System.out.printf("\nId: %d \tName: %s \tEmail: %s \tConatact: %d \tSalary: %d\n",emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getEmpMail(),emp[i].getEmpContact(),emp[i].getEmpSalary());
				}
			}
		System.out.println("-----------------------------------------------------------------------");
	}	
	public void searchEmpId()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Id of Employee for search the Employee");
		int tId=sc.nextInt(); sc.nextLine();
		boolean flag=false;
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].getEmpId()== tId)
			{
				flag=true;
				break;
			}
			else{
				flag=false;
				}
		}
		if(!flag)
		{
			System.out.println(" Employee Not found .!");
		}
		else{
				System.out.println("Employee Found..!");
		}
		System.out.println("-----------------------------------------------------------------------");
					
	}
	public void updateEmpByName()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Enter the Employee Name:");
		String tname=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<emp.length;i++)
		{
			if(tname.toLowerCase().contains(emp[i].getEmpName().toLowerCase()))
			{	System.out.println("Employee fount \n\n Enter New ID :");
				emp[i].setEmpId(sc.nextInt());	sc.nextLine();
				System.out.println("Enter New Email :");
				emp[i].setEmpMail(sc.nextLine());
				System.out.println("Enter New Contact :");
				emp[i].setEmpContact(sc.nextLong());	sc.nextLine();
				System.out.println("Enter New Salary :");
				emp[i].setEmpSalary(sc.nextInt());	sc.nextLine();
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Name Not found ..!");
		}
		System.out.println("-----------------------------------------------------------------------");			
	}
	public void deleteEmpByEmail()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Enter Employee Email: ");
		String temail=sc.nextLine();
		boolean flag=false;
		for(int i=0;i<emp.length-1;i++)
		{
			if(temail.toLowerCase().contains(emp[i].getEmpMail().toLowerCase())) 
			{
				emp[i]=null;
				flag=true;
			}
			
		}
		if(flag)
		{
			System.out.println("Updated Employee Detail:-");
			for (int i = 0; i< emp.length; i++) 
			{
				System.out.printf("\nId: %d \tName: %s \tEmail: %s \tConatact: %d \tSalary: %d\n",emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getEmpMail(),emp[i].getEmpContact(),emp[i].getEmpSalary());	
			}
		}
		else
		{
			System.out.println("Employee Not found");
		}
		System.out.println("-----------------------------------------------------------------------");			
	}
	public void displayEmpCount()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\nlist count of the Employee in company: "+emp.length);
		System.out.println("-----------------------------------------------------------------------");
					
					
	}
	public void displayEmpAscending()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("list the books in the ascending order their id: \n");
		for(int i=0;i<emp.length-1;i++)
		{
			for(int j=i+1;j<emp.length;j++)
			{
				if(emp[i].getEmpSalary()>emp[j].getEmpSalary())
				{
					Employee tem=emp[i];
					emp[i]=emp[j];
					emp[j]=tem;
				}
			}
	    }
		for(int i=0;i<emp.length;i++)
		{
			System.out.printf("\nId: %d \tName: %s \tEmail: %s \tConatact: %d \tSalary: %d\n",emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getEmpMail(),emp[i].getEmpContact(),emp[i].getEmpSalary());	
		}
		System.out.println("-----------------------------------------------------------------------");			
	}
	public void disEmpDataInHighSalarya()
	{
		System.out.println("-----------------------------------------------------------------------");
		int tsalary=0;
		int tidx=0;
		for(int i=0;i<emp.length;i++)
		{
			if(tsalary<emp[i].getEmpSalary())
			{
				tsalary=emp[i].getEmpSalary();
				tidx=i;
			}
		}
		System.out.println("employee details of highest salary:-");
		System.out.printf("\nId: %d \tName: %s \tEmail: %s \tConatact: %d \tSalary: %d\n",emp[tidx].getEmpId(),emp[tidx].getEmpName(),emp[tidx].getEmpMail(),emp[tidx].getEmpContact(),emp[tidx].getEmpSalary());	
		System.out.println("-----------------------------------------------------------------------");
	}
	public void disEmpDataSalRange()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("employee details in minimum salary is 10000 to maximum salary is 60000\n");
		for(int i=0;i<emp.length;i++)
		{
			if(10000<=emp[i].getEmpSalary()&&60000>=emp[i].getEmpSalary())
			{
				System.out.printf("\nId: %d \tName: %s \tEmail: %s \tConatact: %d \tSalary: %d\n",emp[i].getEmpId(),emp[i].getEmpName(),emp[i].getEmpMail(),emp[i].getEmpContact(),emp[i].getEmpSalary());	
			}
		}
		System.out.println("-----------------------------------------------------------------------");
	}
	
}
	
	
	
	