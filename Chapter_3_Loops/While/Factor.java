package While;
//WAP to input number from keyboard and calculate its factorial.
import java.util.*;
public class Factor{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	int fact=1;
	
	while(num>=1){
	   fact = fact *num;
	   num--;
	}
	System.out.printf("Factorial: %d" , fact);
	}
}
