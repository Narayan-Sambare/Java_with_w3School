package While;
/*
Q30. Write a java program to display 1 to nth Prime Number.
*/
	
import java.util.*;
public class Prime1toN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int i = 2; // Start from 2 (because 1 is not prime)

        while(i<=n)
		{
            int count = 0;
            int j = 1;

            while(j <= i)
			{
                if(i%j==0)
					{
                    count++;
					}
                j = j + 1;
            }
            if (count == 2)
				{
                System.out.println(i); // It is prime
				}
            i++;
        }
    }
}
