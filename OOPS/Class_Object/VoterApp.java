// 7. Implement Voting Eligibility
// Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
// Explanation: Introduces basic logical validation.
import java.util.*;
class Voter
{
    void isEligible(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        
    }
}
public class VoterApp
{   
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        Voter v=new Voter();
        v.isEligible(age);
    }
}