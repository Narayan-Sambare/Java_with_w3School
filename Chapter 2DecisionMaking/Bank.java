// Q58. Develop a program to simulate a basic banking menu:
//  1: Deposit
//  2: Withdraw
//  3: Check Balance
//  4: Exit
//  Use a switch to handle user choice and print appropriate messages.

import java.util.*;
public class Bank{

    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the choice \n 1: Deposit \n 2: Withdraw \n 3: Check Balance\n 4: Exit");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Deposit");
                break;
            case 2:
            System.out.println("Withdraw");
                break;
            case 3:
            System.out.println("Check balance");
                break;
            default :
            System.out.println("Exit");
                break;
            
        }
    }
}