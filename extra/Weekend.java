//Write a java program to input week number(1-7) and print the corresponding day of week name using switch
import java.util.*;
public class Weekend{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int num = sc.nextInt();
		switch(num){
			case 1:
				 System.out.println("Sunday"); 
				 System.out.println("Weekday");
				 break;
			case 2:
				 System.out.println("Monday"); 
				 System.out.println("Weekday");
				 break;
			case 3:
				 System.out.println("Tuesday"); 
				 System.out.println("Weekday");
				 break;
			case 4:
				 System.out.println("Wednsaday"); 
				 System.out.printf("Weekday");
				 break;
			case 5:
				 System.out.println("Thrusday");
				 System.out.println("Weekday"); 
				 break;
			case 6:
				 System.out.println("Friday"); 
				 System.out.println("Weekend");
				 break;
			case 7:
				 System.out.println("Saterday");
				 System.out.println("Weekend"); 
				 break;
			default:
				System.out.println("Invalid Input");
				}
}
}