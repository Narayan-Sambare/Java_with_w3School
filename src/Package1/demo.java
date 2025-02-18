package Package1;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Connection Establishes");

try{
	System.out.println("enter value 1");

int a=sc.nextInt();
System.out.println("enter value 2");
int b=sc.nextInt();
int c=a/b;
System.out.println(c);
	}
catch(Exception e) {
	e.printStackTrace(); //for print the same error like compiler
//java.lang.ArithmeticException: / by zero
//	at SSBT/Package1.demo.main(demo.java:15)
	
//	System.out.println("Exception handled");

}
	System.out.println("Connection established");
	}
}
