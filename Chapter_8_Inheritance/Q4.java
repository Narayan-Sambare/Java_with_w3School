/*
4. Question:
 Create a class Student with fields name and marks. Create subclass EngineeringStudent and MedicalStudent.
If marks >= 50, student passes. Otherwise fails.
 Display results for both types of students using an overridden method.


Explanation:
 This tests inheritance for common fields and customized result display logic.
*/

public class Q4
{
	public static void main(String x[])
	{
		EngineeringStudent eng=new EngineeringStudent("sanket",55);
		eng.result();
		
		MedicalStudent med=new MedicalStudent("khushal",44);
		med.result();
		
	}
}
class Student
{
	String name;
	float marks;
	
	void result()
	{
		if(marks>=50)
		{
			System.out.println(" Is pass..!");
		}
		else
		{
			System.out.println(" Is Fail..!");

		}
	}
}

class EngineeringStudent extends Student
{
	EngineeringStudent(String name,float marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
		void result()
		{
			System.out.print("Engineering student : "+name);
			super.result();
		}
		
	
}
class MedicalStudent extends Student
{
	MedicalStudent(String name,float marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
	void result()
	{
		System.out.print("medical student : "+name);
		super.result();
	}
}
