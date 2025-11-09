// 2.Write program to input number using Scanner class and reverse it?

import java.util.*;
public class Q2 {
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();
        int rev = 0;

        while (n<0) 
        {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
