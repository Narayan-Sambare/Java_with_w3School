//2. Write a program to input numbers using Scanner class and reverse it?
import java.util.*;
public class Program2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int  num = sc.nextInt();
		int rev=0;
		while(num!=0){
			rev = rev *10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
	}
}
