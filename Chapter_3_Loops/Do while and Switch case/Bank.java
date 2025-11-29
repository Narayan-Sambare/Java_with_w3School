// Q1. Problem Statement:
//  Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
// Deposit money.
// Withdraw money (only if sufficient balance).
// Check current balance.
// Exit.
// Program should repeatedly allow operations until exit.

import java.util.*;
public class Bank{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in); 
        int ch, balance;
        boolean f=true;
        System.out.println("Enter the initial balance");
        balance=sc.nextInt();
        do{
        System.out.println("Enter Your Choies");
        System.out.println("1.Deposite Money");
        System.out.println("2.Withdrow Money");
        System.out.println("3.Check Current Balance");
        System.out.println("4.Exit");
         ch=sc.nextInt();
         switch(ch)
        {
            case 1:
            System.out.println("/n/n/nEnter the Deposite Amount");
            int depo=sc.nextInt();
            balance=balance+depo;
              System.out.println("Deposite Amount==>"+depo);
               System.out.println("----Deposite Succesfully-----");
              System.out.println("Total Balance==>"+balance);
            break;
            case 2:
            System.out.println("/n/n/nEnter the Withdrow Amount");
            int widro=sc.nextInt();
            balance=balance-widro;
            if(balance>=widro)
            {
              System.out.println("Withdrow Amount==>"+widro);
              System.out.println("----Withdrow Succesfully-----");
              System.out.println("Total Balance==>"+balance);
            }else
            {
                System.out.println("Insufficient balance");
            }
            break;
            case 3:
              System.out.println("/n/n/nYour Current Balance==>"+balance);
            break;
            case 4:
            return;

        }
        }
        while(true);
        
    }
}
