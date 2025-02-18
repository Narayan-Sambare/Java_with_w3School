package Package1;
import java.util.Scanner;

public class ExceptionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coonection Establish");
//		boolean flag = true;
		
//			while(flag) {
				try {
					System.out.println("Enter an Value 1");
					int a = sc.nextInt();
					System.out.println("Enter an Value 2");
					int b = sc.nextInt();
					int c = a/b;
					int n =sc.nextInt();
					int arr[] = new int[n];
					System.out.println("Please Enter Index Number");
					int idx =sc.nextInt();
					arr[idx]= 10;
//					flag = false;
					System.out.println(c);
					}catch (ArithmeticException e) {
						e.printStackTrace();
						System.out.println("Divide by 0 is not permited");
						
					}catch (ArrayIndexOutOfBoundsException e) {
						e.printStackTrace();
						System.out.println("Array is index out of Bounds");
					}catch (ArrayStoreException e) {
						e.printStackTrace();
						System.out.println("Array store Exception");
					}catch (Exception e) {
						e.printStackTrace();
						System.out.println("Exception is handle by parrent");
					}
			
//		}
		
		
		System.out.println("Connection Terminated");
		
	}

}