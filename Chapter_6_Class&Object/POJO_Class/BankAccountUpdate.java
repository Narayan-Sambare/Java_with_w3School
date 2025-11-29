/*
10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
 */
 import java.util.*;
 public class BankAccountUpdate
 {
	 public static void main(String x[])
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the accountHolderNames count");
		int count=sc.nextInt();
		BankAccount ba[]=new BankAccount[count];
		System.out.println("Enter Account holder name,and balance ");
		for(int i=0;i<ba.length;i++)
		{
			ba[i]=new BankAccount();
			ba[i].setacHname(sc.next());
			ba[i].setBalance(sc.nextInt());
		}
		do
		{	System.out.println("1 for update  \n2 for exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				System.out.printf("Enter name and update balance\n");
				String  temname=sc.next();
				int tembal=sc.nextInt();
				
				for(int i=0;i<ba.length;i++)
				{	
					
					if(ba[i].getacHname().contains(temname))
					{
					System.out.printf("\nBefore update the details:\nName: %s Balance :%d\n",ba[i].getacHname(),ba[i].getBalance());
					System.out.printf("\nyou want to update your balance with Amount :%d \n enter 1 \n",tembal);
					int y=sc.nextInt();
						if(y==1)
						{
							ba[i].setBalance(tembal);
							System.out.printf("After update the details:\nName: %s Balance :%d",ba[i].getacHname(),ba[i].getBalance());
							break;
						}
						
					}
				}
				System.out.printf("\nDetails not match\n");
				break;
				
				default :
					return;
					
			}
			
			
		}while(true);
		
		
		
	 }
 }
class BankAccount {
    private String acHname;
    private int balance;


    public String getacHname() {
        return acHname;
    }
    public void setacHname(String acHname) {
        this.acHname = acHname;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

 
		 