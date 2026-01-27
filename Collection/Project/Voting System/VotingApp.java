import java.util.*;

import services.service;

public class VotingApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        service voterseService=new service();
        System.out.println("Welcome to the Voting Application!");
        do{
            System.out.println("1. Register Voter");
            System.out.println("2. Vote");
            System.out.println("3. Exit");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Voter Details:");
                    System.out.println("Enter Voter ID :");
                    int voterId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name :");
                    String name=sc.next();
                    System.out.println("Enter age :");
                    int age=sc.nextInt();
                    Voter voter=new Voter(voterId, name, age);
                    voterseService.registerVoter(voter);
                    System.out.println("Voter registered successfully.");
                    break;
                case 2:
                    
                    System.out.println("Voting in progress...");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        Voter voter=new Voter(1, "John Doe", 25);
    }
}
