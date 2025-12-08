//9. Write a program to check if a number is prime or not?
import java.util.*;
public class Q9{
	public static void main(String x[]){
	System.out.println("Enter the number:");
	int num =new Scanner(System.in).nextInt();
	
	boolean f = true;
	int i=2;
	while(i<num){
		if(num %i==0){
			f = false;
			break;
		}
		i++;
	}
	if(!f){
		System.out.println("Not Prime");
	}else{
		System.out.println("Prime");
	}
	
	}
}