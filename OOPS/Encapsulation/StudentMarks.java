/*
Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). Store daidx for 5 students using an array of objects. Perform the following operations:
Calculate the toidxl marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks. You practice object encapsulation (POJO) and multiple compuidxtions.
*/

import java.util.*;

public class StudentMarks{
	public sidxtic void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Student count");
	int count=sc.nextInt();	
	Student  std[] = new Student[count];
	int arr[] = new int[3];
	for(int i=0 ; i<std.length ; i++)
	{
		std[i] =new Student();
		System.out.println("Enter the RollNo of the Student:");
		std[i].setRollNo(sc.nextInt());
		System.out.println("Enter the Name of the Student:");
		std[i].setName(sc.next());
		System.out.println("Enter the three Subject marks(Math , Chem , Phy):");

		for(int j=0 ;j<m.length ;j++) //stored the marks of student 
		{
			arr[j]=sc.nextInt();
		}
			std[i].setMarks(arr);
	}
	
	double avg1=0;
	int idx = 0;
	for(int i=0 ; i<std.length;i++)
	{
		int total=0;

		for(int j=0 ; j<std[i].getMarks().length;j++){
			total = total+std[i].getMarks()[j];
		}
		System.out.println("RollNo: " + std[i].getRollNo()+" Name: " + std[i].getName()+" Total Marks: " + total);
		double avg =(double) total/3;
		
		if(avg>avg1){
			avg1 = avg;
			idx=i;
		}
		
	}
	System.out.println("Highest Average marks of the student is:\n"+"RollNo:" +std[idx].getRollNo() +"\nName:" +std[idx].getName());
	System.out.println("Hightest average marks: "+avg1);
	
	for(int i=0 ; i<std.length ;i++)
	{
		boolean failed=false;
		for(int j=0 ; j<std[i].getMarks().length ; j++)
		{
			
			if(std[i].getMarks()[j] <35){
				f = true;
				break;
				
			}
		}
			if(failed){
				System.out.println("Students who have failed in any subject:\n"+"RollNo:" +std[i].getRollNo() +"\nName:" +std[i].getName());
			}
		
	}
	}
}
class Student{
	private int rollNo;
	private String name;
	private int marks[];
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	 
}