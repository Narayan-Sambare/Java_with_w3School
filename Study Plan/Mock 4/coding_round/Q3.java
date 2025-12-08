// Q3. Write a java program to swaps the first two digits with the last two digits, and prints the
// result.
// Input : 12345
// Output : 45312

import java.util.Scanner;
public class Q3
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int lastTwo=n%100; //Extracting last two digits
        
        System.out.println("Last Two: "+lastTwo);
        
        int a=1,t=n;
        while(n>0)
        {
            n/=10;
            a*=10;
        }
        n=t;
        int firstTwo=n/(a/100); //Extracting first two digits
        System.out.println("First Two: "+firstTwo);
        int mid=(firstTwo*(a/1000))-n; //Extracting middle digit
        System.out.println("Mid: "+mid);   
        
    }

}
