//3. Write program to character from keyboard and check character is alphabet digit or special symbols?
import java.util.*;
public class Q3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Input:");
	char ch = sc.next().charAt(0);
	
	if((ch >='A' && ch<='Z') || (ch>='a'&&ch<='z')){
		System.out.println("Input is alphabet");
	}else if(ch>='0' && ch<='9'){
		System.out.println("Input is Digit");
	}else{
	System.out.println("Input is special symbols");}
	
	}
}