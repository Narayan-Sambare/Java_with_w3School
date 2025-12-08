/*Q5. Employee Bonus Calculation - Interface with Multiple Rule Classes
Interface: BonusRules
Method:
    double getBonus(double salary)
Implementing Classes:
PermanentEmployee
    Bonus = 20% of salary
ContractEmployee
    Bonus = 10%
Intern
    Bonus = fixed ₹2000
Task:
    Add 7 employees with different types.
    Calculate and print final salary including bonus.
    Count how many employees get bonus above 5000.
Explanation:
Covers:
Interface usage
Multiple implementations
Percentage vs fixed logic
Counting based on a condition
*/
import java.util.*;
public class Employee_Bonus{
    public static void main(String x[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter count ");
        int n=sc.nextInt();
        BonusRules br[]=new BonusRules[n];
                
        for(int i=0;i<br.length;i++)
        {
            System.out.println("Enter salary :");
            double salary=sc.nextDouble();
            System.out.println("Enter name :");sc.nextLine();
            String name=sc.nextLine();
            System.out.println("1.PermanentEmployee\n2.ContractEmployee\n3.Intern" );
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    br[i]=new PermanentEmployee(salary,name);
                    break;
                case 2:
                    br[i]=new ContractEmployee(salary,name);
                    break;
                case 3:
                    br[i]=new Intern(salary,name);
                    break;

                default :
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }

        }
        System.out.println("==================== Final salary ================");
        int b=0;
        for(int i=0;i<br.length;i++)
        {
            double sal=br[i].getSalary();
            double bonus=br[i].getBonus(sal);
            if(bonus>5000)
            {
                b++;
            }
            System.out.println("Emp Name :"+br[i].getName()+"\tBonus : "+bonus+"\tSalary : "+sal+"\tTotal Salary :"+(sal+bonus));
        }
        System.out.println("====================================");

        System.out.println();
        System.out.println("Total "+b+" Emp get bonus above 5000");
    }
}
interface BonusRules{
    double getBonus(double salary);
    String getName();
    double getSalary();
}
class PermanentEmployee implements BonusRules{
    double salary;
    String name;
    public String getName(){
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    PermanentEmployee(double salary, String name)
    {
        this.salary=salary;
        this.name=name;
    }
    public double getBonus(double salary){
        return salary*0.20;
    }
}
class ContractEmployee implements BonusRules{
    double salary;
    String name;
    public double getSalary()
    {
        return salary;
    }
    public String getName(){
        return name;
    }
    ContractEmployee(double salary, String name)
    {
        this.salary=salary;
        this.name=name;
    }
    public double getBonus(double salary){
        return salary*0.10;
    }
}
class Intern implements BonusRules{
    double salary;
    String name;
    public double getSalary()
    {
        return salary;
    }
    public String getName(){
        return name;
    }
    Intern(double salary, String name)
    {
        this.salary=salary;
        this.name=name;
    }
    public double getBonus(double salary){
        return 2000;
    }
}
