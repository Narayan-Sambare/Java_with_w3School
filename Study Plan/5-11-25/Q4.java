//Q4. Write program to Create class name as PersonalInfo 
//with parameterized constructor PersonalInfo(String name, String middlename, String lastname) 
//and you have to create class name as ProfessionalInfo with
//parameterized constructor like as ProfessionalInfo(int id,String des,int salary,String skillset) 
//and you have to inherit PersonalInfo class in ProfessionalInfo
//and pass parameter from ProfessionalInfo class to PersonalInfo using super() constructor
//and you have to define void show() method in ProfessionalInfo and you have to show the all data in show() method.
import java.util.*;
public class Q4 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name = sc.nextLine();
        System.out.println("Enter your middle name:");
        String mname = sc.nextLine();
        System.out.println("Enter your last name:");
        String lname = sc.nextLine();
        System.out.println("Enter your id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your designation:");
        String des = sc.nextLine();
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your skillset:");
        String skillset = sc.nextLine();
        ProfessionalInfo pi = new ProfessionalInfo(id,des,salary,skillset,name,mname,lname);
        pi.show();

    }    
}

class PersonalInfo
{
    String name;
    String mname;
    String lname;

    PersonalInfo(String name, String mname, String lname)
    {
        this.name = name;
        this.mname = mname;
        this.lname = lname;
    }

}

class ProfessionalInfo extends PersonalInfo
{
    int id, salary;
    String des, skillset;
    ProfessionalInfo(int id,String des,int salary,String skillset,String name ,String mname,String lname)
    {
        super(name,mname,lname);
        this.id = id;
        this.des = des;
        this.salary = salary;
        this.skillset = skillset;
    }
    void show()
    {
        System.out.println("Name: " + name + " " + mname + " " + lname);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + des);
        System.out.println("Salary: " + salary);
        System.out.println("Skillset: " + skillset);
    }
}
