import java.util.Scanner;
class Faculty extends Person
{
    Scanner sc=new Scanner(System.in);
	String subject;
	double salary;
	int experience;
	Faculty(int id, String name, String address,String contactNo,double salary,int experience)
	{
		super(id,name,address,contactNo);
		this.salary=salary;
		this.experience=experience;
	}
	void addDetails()
	{
		System.out.println("Enter id ");
		id=sc.nextInt(); sc.nextLine();
		System.out.println("Enter name ");
		name=sc.nextLine();
		System.out.println("Enter Address ");
		address=sc.nextLine();
		System.out.println("Enter ContactNo ");
		contactNo=sc.nextLine();
        System.out.println("Enter salary ");
        salary=sc.nextDouble(); sc.nextLine();
        System.out.println("Enter experience ");
        experience=sc.nextInt(); sc.nextLine();
	 }
	void assignSubject()
	{
		System.out.println("Enter subject name");
		subject=sc.nextLine();
	}
	
	void calculateIncrement()
	{
        if(experience>5)
        {
            salary=salary+(salary*0.1);
        }
	}
	void displayDetails()
	{
        System.out.println("=================Faculty details==================");
        System.out.println("Id : "+id+" Name : "+name+" Address : "+address+" ContactNo : "+contactNo);
        System.out.println("Subject : "+subject+" \nSalary : "+salary+"\n Experience : "+experience);
        System.out.println("===============================================");
	}
    void displayFacultyInfo()
    {
        System.out.println("=================Faculty Complete Info==================");
        System.out.println("Subject : "+subject+" \nSalary : "+salary+"\n Experience : "+experience);
        System.out.println("=======================================================");
    }
}