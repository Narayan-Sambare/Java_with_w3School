import java.util.Scanner;
class Person
{
    Scanner sc=new Scanner(System.in);
	 int id;
	 String name;
	 String address;
	 String contactNo;
	 Person(int id, String name, String address,String contactNo)
	 {
		 this.id=id;
		 this.name=name;
		 this.address=address;
		 this.contactNo=contactNo;
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
	 }
	 void displayDetails()
	 {
		System.out.println("=================Person details==================");
		System.out.println("Id : "+id+" Name : "+name+" Address : "+address+" ContactNo : "+contactNo);
	 }
	 void updateAddress()
	 {
		System.out.println("Enter new Address");
		address=sc.nextLine();
	 }
	 void updateContact()
	 {
		System.out.println("Enter new contact no");
		contactNo=sc.nextLine();
	 }
	 void showBasicInfo()
	 {
		System.out.println("================= Basic Info ==================");
		System.out.println("Id : "+id+" Name : "+name+" ContactNo : "+contactNo);
	 }
}