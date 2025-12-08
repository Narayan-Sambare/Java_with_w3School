/*
Q1. Online Payment System – Using Interface
Interface: Payment
Methods:
    processPayment(double amount)
    getCharges()
Classes Implementing Interface:
    UPI – No extra charges
    CreditCard – 2% processing fee
    DebitCard – 1% processing fee
Task:
    Take 5 payments (mix of UPI, credit, debit).
    Print final amount after adding charges.
    Count how many payments used CreditCard.
Explanation:
    This question checks:
    How class implements an interface
    Polymorphism using interface reference
    Logic to add percentage charges
    Filtering and counting items
*/
import java.util.*;
public class Online_Payment_System {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter payment count");
        int n=sc.nextInt();
        Payment p[]=new Payment[n];
        for(int i=0;i<p.length;i++)
        {
            System.out.println("Amount");
            double amount=sc.nextDouble();
            System.out.println("Enter type of Payment\n1.UPI\n2.CreditCard\n3.DebitCard ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    p[i]=new UPI(amount);
                    break;
                case 2:
                     p[i]=new CreditCard(amount);
                    break;
                case 3:
                    p[i]=new DebitCard (amount);
                    break;
                default :
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }

        }
         System.out.println("================ Final about after adding charges =============== ");
         int total_fine= 0;
         int c=0;
        for(int i=0;i<p.length;i++)
        {
            double amount = p[i].getAmount();
            double finalAamount=p[i].processPayment(amount);

            if(p[i].getType().equals("CreaditCard"))
            {
                c++;
            }
            System.out.println("type : "+p[i].getType()+"\tAmount : "+amount+"\tFinal Amout : "+finalAamount);
        }
        System.out.println("========================================= ");

        System.out.println(c+" payments used CreditCard");

    }   
     
}
interface Payment
{
    double processPayment(double amount);
    double getCharges();
    double getAmount();
    String getType();
    
}
class UPI implements Payment
{
    double amount;
    String type ="UPI";
    public String getType()
    {
        return type;
    }
    public double getAmount()
    {
        return amount;
    }
    UPI(double am)
    {
        this.amount=am;
    }  
    public double processPayment(double amount)
    {
        return amount;
    }
    public double getCharges()
    {
        return 0;
    }
}
class CreditCard  implements Payment
{
    double amount;
    String type ="CreaditCard";
    public String getType()
    {
        return type;
    }
    public double getAmount()
    {
        return amount;
    }
    CreditCard(double am)
    {
        this.amount=am;
    }  
    public double processPayment(double amount)
    {
        return amount+(amount*0.02);
    }
    public double getCharges()
    {
        return amount*0.02;
    }
}
class DebitCard  implements Payment
{
    double amount;
    String type ="DebitCard";
    public String getType()
    {
        return type;
    }
    public double getAmount(){
        return amount;
    }
    DebitCard(double am){
        this.amount=am;
    }  
    public double processPayment(double amount){
        return amount+(amount*0.01);
    }
    public double getCharges()    {
        return amount*0.01;
    }
}