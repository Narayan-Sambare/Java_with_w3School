class Student extends Person
{
	String courseName;
	int marks[];
	float percentage;
	Student(int id, String name, String address,String contactNo,String courseName)
	{
		super(id,name,address,contactNo);
		this.courseName=courseName;
	}
    void addDetails(int ch)
	 {
        if(ch==1)
        {
            System.out.println("Enter id ");
		    System.out.println("Enter id ");
		    id=sc.nextInt(); sc.nextLine();
		    System.out.println("Enter name ");
		    name=sc.nextLine();
		    System.out.println("Enter Address ");
		    address=sc.nextLine();
		    System.out.println("Enter ContactNo ");
		    contactNo=sc.nextLine();
            System.out.println("Enter course name ");
            courseName=sc.nextLine();
        }
        
	 }
	void enterMarks()
	{
        marks=new int[3];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	float calculatePercentage()
	{
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			sum+=marks[i];
		}
       this.percentage=sum/(float)marks.length;
        
		return percentage;

	}
	void displayDetails()
	{
		System.out.println("=================Student details==================");
		System.out.println("Id : "+id+" Name : "+name+" Address : "+address+" ContactNo : "+contactNo);
		System.out.println("courseName : "+courseName+" \nMarks : "+marks[0]+","+marks[1]+","+marks[2]+"\n percentage : "+percentage);
	}
}