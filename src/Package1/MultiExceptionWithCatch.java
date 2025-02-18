package Package1;
import java.util.Scanner;

public class MultiExceptionWithCatch {
	public static void main(String[] args) {
		System.out.println("main2  Enstablish");
		Test5 t5 = new Test5();
		 t5.alpha();
		
		System.out.println("main terminate");

	}

}

class Test5{
	void alpha(){
		System.out.println("1 Enstablish");
		Test6 t6 = new Test6();
		 t6.beta();
		
		System.out.println("1 terminate");
		
	}
}
class Test6{
	void beta(){
		System.out.println("2 Enstablish");
		Test7 t7 = new Test7();
		 t7.gamma();
		
		System.out.println("2 terminate");
		
	}
}
class Test7{
	void gamma(){
		System.out.println("3 Enstablish");
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Please enter size of an Array");
			int size = sc.nextInt();
			int a[]=new int[size];
		} catch(Exception e) {
			System.out.println("Exception is handled by the gamma");
		}
		
		
		
		
		System.out.println("3 terminate");
		
	}
}