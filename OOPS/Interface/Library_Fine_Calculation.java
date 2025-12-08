/*
Q3. Library Fine Calculation – Interface with Rules
Interface: FineCalculator
Method:
calculateFine(int daysLate)
Implementing Classes:
Book
Fine = ₹2 × daysLate
Magazine
Fine = ₹3 × daysLate
ResearchPaper
Fine = ₹5 × daysLate
If daysLate > 10 → add extra ₹50
Task:
Accept 8 items (mix of all types).
Calculate fine and print details.
Find total fine collected.
Explanation:
Covers:
Interface method overriding
Logical conditions inside implementing classes
Summation of results
Mixing different classes via interface reference
*/
import java.util.*;
public class Library_Fine_Calculation{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter books count");
        int n=sc.nextInt();
        FineCalculator fc[]=new FineCalculator[n];
        for(int i=0;i<fc.length;i++)
        {
            System.out.println("Enter DaysLate ");
            int days=sc.nextInt();
            System.out.println("Enter type of book\n1.Book\n2.Magazine\n3.ResearchPaper ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    fc[i]=new Book(days);
                    break;
                case 2:
                    fc[i]=new Magazine(days);
                    break;
                case 3:
                    fc[i]=new ResearchPaper(days);
                    break;
                default :
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }

        }
        System.out.println("================ Details with Fine =============== ");
         int total_fine= 0;
        for(int i=0;i<fc.length;i++)
        {
            int days = fc[i].getDaysLate();
            int result = fc[i].calculateFine(days);
            total_fine+=result;
            System.out.println("type :"+fc[i].getType()+"\tDaysLate : "+days+"\tFine : "+result);
        }
        System.out.println("========================================= ");

        System.out.println(total_fine+" Total fine Collected");




    }    
}
interface FineCalculator{
    int calculateFine(int daysLate);
    int getDaysLate();
    String getType();

}
class Book implements FineCalculator{
    int daysLate;
    String type="Book";
    public String getType()
    {
        return type;
    }
    Book(int days)
    {
        this.daysLate=days;
    }
    public int getDaysLate()
    {
        return daysLate;
    }
    public int calculateFine(int daysLate)
    {
        
        return 2*daysLate;
    }
}
class Magazine implements FineCalculator{
    int daysLate;
    String type="Book";
    public String getType()
    {
        return type;
    }
    Magazine(int days)
    {
        this.daysLate=days;
    }
    public int getDaysLate()
    {
        return daysLate;
    }
    public int calculateFine(int daysLate)
    {
        
        return 3*daysLate;
    }
}
class ResearchPaper implements FineCalculator{
    int daysLate;
    String type="Book";
    public String getType()
    {
        return type;
    }
    ResearchPaper(int days)
    {
        this.daysLate=days;
    }
    public int getDaysLate()
    {
        return daysLate;
    }
    public int calculateFine(int daysLate)
    {
        int fine=5*daysLate;
        if(daysLate>10)
        {
            fine+=50;
        }
        return fine;
    }
}