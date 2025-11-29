/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
Explanation:
 Shows how to use constructors to initialize and process multiple fields at once.
  */
class Student
{
    int rollNo,m1,m2,m3,total;
    String name;
    Student(int rollNo, String name, int m1,int m2, int m3)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.total=m1+m2+m3;
    }
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total Marks : " + total);
    }
}
public class Q2
{
    public static void main(String x[])
    {
        Student s=new Student(1,"sanket",55,66,53);
        s.display();

    }
}