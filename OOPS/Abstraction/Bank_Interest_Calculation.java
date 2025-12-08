import java.util.*;

public class Bank_Interest_Calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count");
        int n=sc.nextInt();
        BankAccount[] ac = new BankAccount[n];
        for(int i=0;i<ac.length;i++)
        {
            System.out.println("Enter account number");
            sc.nextLine();
            String acc=sc.nextLine();
            System.out.println("Enter balance ");
            double bal=sc.nextDouble();
            System.out.println("1.SavingAccount\n2.CurrentAccount\n3.FixedDepositAccount");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    ac[i] = new SavingAccount(acc, bal);
                    break;
                case 2:
                    ac[i] = new CurrentAccount (acc, bal);
                    break;
                case 3:
                    ac[i] = new FixedDepositAccount (acc, bal);
                    break;
            
                default:
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }
        }
        
        
        double maxInterest = 0;
        BankAccount maxAccount = null;

        System.out.println("\n\n=== Interest Calculation ===\n");
        for (BankAccount account : ac)
            {
            double interest = account.calculateInterest();
            account.balance += interest;
            System.out.println("Account: " + account.getacNO() +", Interest: " + interest + ", New Balance: " + account.getBalance());

            if (interest > maxInterest){
                maxInterest = interest;
                maxAccount = account;
            }
        }

        System.out.println("\n=== Account with Highest Interest ===\n");
        System.out.println("Account: " + maxAccount.getacNO() + ", Interest: " + maxInterest + ", Balance: " + maxAccount.getBalance());
        System.out.println();
    }
}

abstract class BankAccount 
{
    protected String acNO;
    protected double balance;

    BankAccount(String acNO, double balance) {
        this.acNO = acNO;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + ", New Balance: " + balance);
    }

    void withdraw(double amt) {
        if (balance >= amt)
        {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + ", New Balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance!");
        }
    }

    String getacNO() {
        return acNO;
    }

    double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount{
    public SavingAccount(String acNO, double balance){
        super(acNO, balance);
    }
    double calculateInterest(){
        return balance * 0.06;
    }
}

class CurrentAccount extends BankAccount{
    public CurrentAccount(String acNO, double balance){
        super(acNO, balance);
    }
    double calculateInterest(){
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount{
    public FixedDepositAccount(String acNO, double balance){
        super(acNO, balance);
    }
    double calculateInterest() {
        return balance * 0.075;
    }
}
