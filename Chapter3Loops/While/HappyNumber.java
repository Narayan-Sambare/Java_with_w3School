package While;
/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of 
steps where in each step number is replaced by the sum of squares of its digit,
that is if we start with Happy Number and keep replacing it with digits 
square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/
import java.util.Scanner;
public class HappyNumber
{
    public static void main(String x[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num = n;
        int sum;
        while(num!=1 && num!=4) // 4 is where non-happy numbers loop
		{ 
				sum=0;
				while(num>0)    //sep sq digit 19---1^2+9^2==82
				{
					int LastN=num%10;
					sum=sum+(LastN*LastN);
					num=num/10;
				}
			num = sum;
		}
		if (num == 1)
		{
			System.out.println("num--->"+num);
            System.out.println(n + " is a Happy Number.");
		} 
		else
		{
            System.out.println(n + " is NOT a Happy Number.");
        }
    }
}
