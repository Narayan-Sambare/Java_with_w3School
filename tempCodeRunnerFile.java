/*Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
    A default constructor to set balance = 1000
    A parameterized constructor to initialize all fields
    A method deposit() to add money
    A method display() to show details.
Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
This question tests constructor overloading — how multiple constructors can initialize objects differently. */

class BankAccount
{
    long accNo;
    String accHolder;
    double balance;
    BankAccount()
    {
        balance=1000;
    }
    void deposit(int b)
    {
       balance+=b;
    }
    void display()
    {
        System.out.println(accNo);
        System.out.println(accHolder);
        System.out.println(balance);
    }

}
public class Q3
{
    public static void main(String x[])
    {
        BankAccount bc=new BankAccount();
        bc.deposit(500);
        bc.display();
    }
}