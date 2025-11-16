/*
Q1. Problem Statement :
Write a Java program to design a College Management System using the concept of inheritance.
The system should maintain and process details of both Students and Faculty members.
Use one parent class and two child classes, and perform ten sequential operations related to student and faculty management.
Class Structure:
Parent Class – Person
Data Members: int id, String name, String address, String contactNo
Member Methods:
	addDetails() – Accept and store basic person details.
	displayDetails() – Display details of a person.
	updateAddress() – Update the address of a person.
	updateContact() – Update contact number.
	showBasicInfo() – Display ID, name, and contact number.
	
Child Class 1 – Student extends Person
Additional Data Members: String courseName, int marks[3], double percentage
Additional Methods:
    6. enterMarks() – Accept marks of three subjects.
    7. calculatePercentage() – Calculate and store percentage based on marks.
	
Child Class 2 – Faculty extends Person
Additional Data Members: String subject, double salary, int experience
Additional Methods:
   8. assignSubject() – Assign subject to faculty.
   9. calculateIncrement() – Increase salary by 10% if experience is greater than 5 years.
  10. displayFacultyInfo() – Display faculty’s subject, salary, and experience.


Operations to Perform (Sequentially):
	1.Add student details using addDetails() method.
	2.Enter marks for three subjects using enterMarks().
	3.Calculate and store the student’s percentage using calculatePercentage().
	4.Update the student’s contact number using updateContact().
	5.Display all details of the student using displayDetails().
	6.Add faculty details using addDetails() method.
	7.Assign subject to faculty using assignSubject().
	8.Calculate salary increment for the faculty using calculateIncrement().
	9.Update the faculty’s address using updateAddress().
	10.Display complete faculty information using displayFacultyInfo().
	
Instructions:
	1.Use constructors in all classes for initialization.
	2.Use the super keyword to call parent constructors in child classes.
	3.Apply method overriding for displayDetails() to show specific outputs for each child class.
	4.Perform all 10 operations sequentially in the main() method.
	5.Do not use collections; use arrays or primitive variables only.
*/
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);

		// do{
		// System.out.println("1.Add student details using addDetails() method.\n 2.Enter marks for three subjects using enterMarks().\n3.Calculate and store the student’s percentage using calculatePercentage().\n4.Update the student’s contact number using updateContact().\n5.Display all details of the student using displayDetails().\n6.Add faculty details using addDetails() method.\n7.Assign subject to faculty using assignSubject()\n8.Calculate salary increment for the faculty using calculateIncrement().\n9.Update the faculty’s address using updateAddress().\n10.Display complete faculty information using displayFacultyInfo().");
		// int choice=sc.nextInt();
		// }while(true);

		System.out.println("Enter Student Details");
		System.out.println("Enter Student id");
		int id=sc.nextInt(); sc.nextLine();	

		System.out.println("Enter Student name");
		String name=sc.nextLine();
		System.out.println("Enter Student Address");
		String address=sc.nextLine();
		System.out.println("Enter Student ContactNo");
		String contactNo=sc.nextLine();
		System.out.println("Enter Student Course Name");
		String courseName=sc.nextLine();

		
		Student s=new Student(id,name,address,contactNo,courseName);
		System.out.println("Adding Student Details using addDetails() method enter 1 for add details");
		int ch=sc.nextInt(); sc.nextLine();
		s.addDetails(ch);
		System.out.println("Enter marks of 3 subjects");
		s.enterMarks();
		float percentage=s.calculatePercentage();
		System.out.println("Student persentage is : "+percentage);
		s.updateContact();
		s.displayDetails();

		System.out.println("Enter Faculty Details");
		System.out.println("Enter Faculty id");
		id=sc.nextInt(); sc.nextLine();	

		System.out.println("Enter faculty name");
		name=sc.nextLine();
		System.out.println("Enter faculty Address");
		address=sc.nextLine();
		System.out.println("Enter faculty ContactNo");
		contactNo=sc.nextLine();
		System.out.println("Enter faculty Salary");
		double salary=sc.nextDouble(); sc.nextLine();
		System.out.println("Enter faculty Experience");
		int experience=sc.nextInt(); sc.nextLine();

		Faculty f=new Faculty(id,name,address,contactNo,salary,experience);
		f.addDetails();	
		f.assignSubject();
		f.calculateIncrement();
		f.updateAddress();
		f.displayFacultyInfo();

	}
}
