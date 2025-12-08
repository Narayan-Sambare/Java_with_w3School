/*
Q4. Employee_Performance_System – Abstract Score Calculation
Abstract class: Employee
    Fields:name, id
    Method:abstract int performanceScore()
Child classes:
    Developer
        Score = completedTasks × 10
    Tester
        Score = bugsFound × 5
    Manager
        Score = teamHandled × 20 + projectsDelivered × 15
Task:
    Create 8 employees of mixed types.
    Calculate score for each user.
    Print employees who have score ≥ 80.
Explanation:
Demonstrates:
Abstract method implemented differently
Logical operations based on multiple fields
Filtering objects with conditions
*/
import java.util.*;
public class Employee_Performance_System{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Emp count ");
        int n=sc.nextInt();
        Employee emp[]=new Employee[n];
        for(int i=0;i<emp.length;i++)
        {

            System.out.println("Enter id :");
            int id=sc.nextInt();
            System.out.println("Enter name :");sc.nextLine();
            String name=sc.nextLine();
            System.out.println("\t1.Developr\n\t2.Tester\n\t3.Manager");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("task :");
                    int task=sc.nextInt();
                    emp[i]=new Developer(id,name,task);
                    break;
                case 2:
                    System.out.println("Bugs :");
                    int bugs=sc.nextInt();
                    emp[i]=new Tester(id,name,bugs);
                    break;
                case 3:
                    System.out.println("team :");
                    int team=sc.nextInt();
                    System.out.println("project :");
                    int project=sc.nextInt();
                    emp[i]=new Manager(id,name,team,project);
                    break;
                    default:
                        System.out.println("Enter valid input");
                        i--;
                        break;
            }
        }
        System.out.println("=============== Score of each Employees ===============\n");
        
        for(Employee i: emp)
        {
            int result = i.performanceScore();
            System.out.println("ID : "+i.id+" \tname : "+i.name+" \tScore : "+result);
        }
        System.out.println("================================================");
        System.out.println();
        System.out.println("==================== employees who have score >= 80==================");
        for(Employee i: emp)
        {
            int result = i.performanceScore();
            if(result>80)
            {
                System.out.println("ID : "+i.id+" \tname : "+i.name+" \tScore : "+result);
            }
        }  
        System.out.println();

    }
}
abstract class Employee{
    int id;
    String name;
    Employee(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    abstract int performanceScore();
}
class Developer extends Employee{
    int task;
    Developer(int id,String name,int task){
        super(id,name);
        this.task=task;
    }
    public int performanceScore(){
        
        return task*10;
    }
}
class Tester extends Employee{
    int bugs;
    Tester(int id,String name,int bugs){
        super(id,name);
        this.bugs=bugs;
    }
    public int performanceScore(){
        
        return bugs*5;
    }
}
class Manager extends Employee{
    int team;
    int project;
    Manager(int id,String name,int team,int project){
        super(id,name);
        this.team=team;
        this.project=project;
    }
    public int performanceScore(){
        
        return (team*20)+(project*15);
    }
}