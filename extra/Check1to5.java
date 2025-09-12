// Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display //“Invalid number”.


import java.util.*;
public class Check1to5{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number");
        int num = sc.nextInt();
		switch(num){
			case 1:
				 System.out.println("ONE"); 
				 
				 break;
			case 2:
				 System.out.println("TWO"); 
				 break;
			case 3:
				 System.out.println("THREE"); 

				 break;
			case 4:
				 System.out.println("FOUR"); 

				 break;
			case 5:
				 System.out.println("FIVE");
				break;
			default:
				System.out.println("Invalid Input");
				}
}
}