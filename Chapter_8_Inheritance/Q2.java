//  Q2. Question:
//  Create a class BankAccount with a method calculateInterest(). 
//  Create subclasses SavingsAccount (interest rate 5%) 
//  Create subclasses CurrentAccount (interest rate 3%).
//  Calculate interest for different account types and display it.
// Explanation:
//  This tests inheritance with customized implementations in child classes
public class Q2 
{
    public static void main(String[] args) 
    {
        SavingsAccount sa=new SavingsAccount("12344555", "Sanket", 500);
        double sInterest=sa.calculateInterest();
        System.out.println("Interest for Savings Account :"+sInterest);

        CurrentAccount ca=new CurrentAccount("12344555", "narayan", 520);
        double cInterest=ca.calculateInterest();
        System.out.println("Interest for Current Account :"+cInterest);
        
    }
}
class BankAccount
{ 
   
    String accountNumber;
     String accountHolderName;
    double balance;
    double interestRate;
    BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
   
    double calculateInterest()
    {
        return interestRate;
    }
}
class SavingsAccount extends BankAccount 
{
    SavingsAccount(String accountNumber, String accountHolderName, double balance)
    {
        super(accountHolderName, accountNumber, balance);
        this.interestRate=balance*0.5;
    }
}

class CurrentAccount extends BankAccount 
{
    CurrentAccount( String accountNumber,String accountHolderName,  double balance)
    {
        super(accountHolderName, accountNumber, balance);
        this.interestRate=balance*0.3;
    }
}

