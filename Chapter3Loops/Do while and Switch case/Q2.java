// Q2.Problem Statement:
//  Write a menu-driven program using do-while and switch-case to:
// Check if a number is prime.
// Find the sum of digits of a number.123
// Reverse a number.
// Exit.
// Perform operations repeatedly until the user selects exit.

import java.util.*;
public class Q2 {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
       do{
        System.out.println("Enter Your Choice");
        System.out.println("1.Check if a number is prime");
        System.out.println("2.Find the sum of digits of a number");
        System.out.println("3.Reverse a number");
        System.out.println("4.Exit");
        int ch=sc.nextInt();
        switch (ch)
		{
            case 1:
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int i=2;
                while(i<=n)
                {              
                    if(n%i!=0)
                    {
                        System.out.println("Prime number\n\n");
                        break;
                    }else
                    {
                        System.out.println("not prime number\n\n");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Enter the number");
                int num=sc.nextInt();
                int rem,sum=0;
                while(num>0)
                {
                     rem=num%10;
                     num=num/10;
                     sum=sum+rem;
                }
                System.out.println("Sum==>"+sum);
                break;

            case 3:
				System.out.println("Enter the number");
                 num=sc.nextInt();
                int rev=0;
					rem=0;
                while(num>0)
                {
                     rem=num%10;
                     num=num/10;
                     rev=rev*10+rem;
                }
                System.out.println("reverse number==>"+rev);
                break;
            case 4:
				return;
        }
       }
       while(true);

    }
}
