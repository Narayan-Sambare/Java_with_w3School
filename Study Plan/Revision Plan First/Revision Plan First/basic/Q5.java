//5. Write a program to input numbers and check if the number is perfect or not?
import java.util.*;
public class Q5{
	public static void main(String x[]){
	System.out.println("Enter the Number");
	int num =new Scanner(System.in).nextInt();
	
	int i=1,sum=0;
	while(i<num){
		if(num%i==0){
			sum +=i;
		}
		i++;
	}
	if(sum == num ){
	System.out.println("Perfect Number");
	}else{
	System.out.println("Not Perfect Number");
	}
	}
}