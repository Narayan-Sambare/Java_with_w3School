//Customized Exception of the bank System
package Package1;
import java.util.Scanner;

public class Bank1app {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.transaction();
	}
}
class Bank {
	void transaction() {
		ATM atm = new ATM();

		 try {
			 atm.AcceptInfo();
			 atm.Verify();
		 }catch(InvalidinputException e){
//			 System.out.println("Info recived by bank");
//			 e.printStackTrace();
			 System.err.println("Wrong info!!");
			 System.out.println("<<<<<Second Attempt>>>>>");
			
		 }  try {
			 atm.AcceptInfo();
			 atm.Verify();
		 }catch(InvalidinputException e){
//			 System.out.println("Info recived by bank");
//			 e.printStackTrace();
			 System.err.println("Wrong info!!");
			 System.out.println("<<<<<Last Attempt>>>>>");
			
		 }  try {
			 atm.AcceptInfo();
			 atm.Verify();
		 }catch(InvalidinputException e){
//			 System.out.println("Info recived by bank");
//			 e.printStackTrace();
			 System.err.println("Wrong info!!");
			 System.out.println("Account Block for the next 24 hour");
			
		 }
		 
	}

}




class ATM {
	int Account = 1212413;
	int Password = 2003;
	int newAcc;
	int newPass;
	
	  void AcceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account no:");
		 newAcc = sc.nextInt();
		System.out.println("Enter the Password");
		 newPass = sc.nextInt();
		
	}
	
	void Verify() throws InvalidinputException {
		if(Account == newAcc && Password == newPass) {
			System.out.println("Verified");
		}else {
			InvalidinputException e	=new InvalidinputException();
//			System.err.println( e.getMassage());	
			throw e;
			}
	}
}

class InvalidinputException  extends Exception{
	
	public String getMassage() {
		
		return "Wrong info!!" ;
	}
}