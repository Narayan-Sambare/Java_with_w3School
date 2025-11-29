/*
7. Student Grade Evaluation
Task:
 Create a Student class with fields: name, marks, and subject.
 In the main method:
Create a Student object.
Check if the student has passed or failed the subject (passing marks >= 40) and print the result.
Explanation:
 This task involves condition checking and field manipulation.
 */
 import java.util.*;
 public class StudentGradeEvalution
 {
	 public static void main(String x[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sudent count");
		int count=sc.nextInt();
		Student s[]=new Student[count];
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student();
			System.out.println("Enter student name:");
			s[i].setName(sc.next());
			System.out.printf("Enter the marks ");
			s[i].setMarks(sc.nextInt());
			System.out.printf("Enter the Subject name ");
			s[i].setSubject(sc.next());
			
			if(s[i].getMarks()>=40)
			{
				System.out.printf("\n%s is pass\n",s[i].getName());
			}
			else
			{
				System.out.printf("\n%s is failed\n",s[i].getName());
			}

		}
		
	 }
 }
 class Student
 {
	 private String name;
	 private int marks;
	 private String subject;
	 
	 public String getName() {return name;}
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getMarks(){return marks;}
	 public void setMarks(int marks) {
		 this.marks = marks;
	 }
	 public String getSubject(){return subject;}
	 public void setSubject(String subject) {
		 this.subject = subject;
	 }
	 
 }
 
		 