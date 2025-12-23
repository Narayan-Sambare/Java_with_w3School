/*
Q1. Problem:
Create a POJO class Student with fields: rollNo, name, marks[] (array of 3 subjects). 
Store data for 5 students using an array of objects. Perform the following operations:
Calculate the total marks of each student.
Find the student with the highest average marks.
Display the list of students who have failed in any subject (marks < 35).
Explanation:
This problem tests array of objects, iteration inside objects, and conditional checks.
 You practice object encapsulation (POJO) and multiple computations.
*/

import java.util.*;
public checks StudentApp
{	static Scanner sc=new Scanner(System.in);
	public static void main(String x[])
	{	
		System.out.println("Enter the count of student");
		int count=sc.nextInt();
		Student std[]=new Student[count];
		int a[]=new int[3];
		
		for(int i=0;i<std.length;i++)
		{	
			std[i]=new Student();
			
			System.out.println("Enter rollNo");
			std[i].setRollNo(sc.nextInt());
			
			System.out.println("Enter Name");
			std[i].setName(sc.next());
			for(int j=0;j<a.length;j++)
			{
				System.out.println("Enter "+(j+1)+" subject marks");
				a[j]=sc.nextInt();
			}
				std[i].setMarks(a);	
		}	
			//display 
			for(int i=0;i<std.length;i++)
			{
				int total=0,avg,havg=0;
				for(int j=0;j<a.length;j++)
				{
					total+=std[i].getMarks()[j];
				}
					avg=(tatal/3);
					
				if(havg<avg))
				
				
			}
		
	}
}
/*
class Admin
{
	public int add(int a[])
	{	int total=0
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		return total;
	}		
	public int avg(int total)
	{		
		return avg;
	}		
}
*/
class Student{
    private int rollNo;
    private String name;
    private int[] marks;

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setMarks(int[] marks){
        if(marks.length == 3)
		{
            this.marks = marks;
        } else {
            System.out.println("Please provide exactly 3 subject marks.");
        }
    }
}
