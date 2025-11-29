// Q42. Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
//  Explanation:
//  Use loop to check square and a while loop to match last digits.
import java.util.*;
public class AutomorphicN {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the number");
        // int n=sc.nextInt();
        int n=100,sq;
        for(int i=0;i<=n;i++)
        {   sq=0;
            sq=i*i;
            if(i<10)
            {
                if((sq%10)==i)
                {
                    System.out.println(i);
                }
            }
            else if(i<100)
            {
                if((sq%100)==i)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
