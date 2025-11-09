/*
5. Question:
 Create a base class Staff with a method incrementSalary().
For TeachingStaff, salary increases by 15%.

For NonTeachingStaff, salary increases by 10%.
 Print new salaries using method overriding.

Explanation:
 This tests inheritance with percentage-based calculations in subclasses.
 
 */
 
 public class Q5
 {
	 public static void main(String x[])
	 {
		TeachingStaff ts=new TeachingStaff("sanket",12000);
		double newSal=ts.incrementSalary();
		System.out.println("Name : "+ts.getName());
		System.out.println("Original salary : "+ts.getSalary());
		System.out.println("Increment Salary : "+newSal);
		
		NonTeachingStaff nts=new NonTeachingStaff("narayan",1000);
		newSal=nts.incrementSalary();
		System.out.println("Name : "+nts.getName());
		System.out.println("Original salary :"+nts.getSalary());
		System.out.println("Increment Salary :"+newSal);
		
		
		
		
	 }
 }
 class Staff
 {
	 private String name;
	 protected double salary;
	 
	Staff(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	 public String getName()
	 {
		 return name;
	 } 
	 public double getSalary()
	 {
		 return salary;
	 }
	 
	double incrementSalary()
	{
		return salary;
	}
 }
 class TeachingStaff extends Staff
 {
	TeachingStaff(String name, double salary)
	{
		super(name,salary);
	}
	double incrementSalary()
	{
		return salary+ (salary*15)/100;
	}
	
 }
 
 class NonTeachingStaff extends Staff
 {
	NonTeachingStaff(String name, double salary)
	{
		super(name,salary);
	}
	double incrementSalary()
	{
		return salary+ (salary*10)/100;
	}
 }