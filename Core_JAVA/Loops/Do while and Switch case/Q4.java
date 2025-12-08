// Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
// 1.Count the number of digits
// 2.Count how many digits are even
// 3.Find the product of all odd digits
// 4.Check if the number is an Armstrong number
// 5.Exit the program

import java.util.*;
public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int tem=n;
        do
        {
           System.out.println("Choose the one number:-"); 
           System.out.println("1.Count the number of digits"); 
           System.out.println("2.Count how many digits are even"); 
           System.out.println("3.Find the product of all odd digits"); 
           System.out.println("4.Check if the number is an Armstrong number"); 
           System.out.println("5.Exit the program\n\n"); 
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1: System.out.println("\n\nThis code for Count the number of digits\n"); 
                    int count=0;
                    while(n>0)
                    {
                        n=n/10;
                        count++;
                    }
                    System.out.println("Number is "+count+" digit");
                    n=tem;
                    break;
                case 2: System.out.println("\n\nThis code for Count how many digits are even\n");
                int rem;
                count=0;
                    while(n>0){
                        rem=n%10;
                        n=n/10;
                        if(rem%2==0){
                            count++;
                        }
                    }
                    System.out.println(count+"digits are Even");
                    n=tem;
                    break;
                    
                case 3: System.out.println("\n\nThis code for Find the product of all odd digits\n");
                    rem=0; 
                    int pro=1;
                    while(n>0){
                        rem=n%10;
                        n=n/10;
                        if(rem%2!=0){
                            pro=pro*rem;
                        }
                    }
                    System.out.println("The product of all odd digit is "+pro);
                    break;

                case 4: System.out.println("\n\nThis code for Check if the number is an Armstrong number\n"); 
                    count=0;
                    rem=0;
                    int sum=0;
                    while(n>0)
                    {
                        n=n/10;
                        count++;
                    }
                    n=tem;
                    while(n>0)
                    {
                        rem=n%10;
                        n=n/10;
                        int a=(int)Math.pow(rem,count);
                        sum=sum+a;
                    }
                    n=tem;
                    if(n==sum){
                        System.out.println("number is Armstrong number");
                    }
                    else{
                        System.out.println("number is Not Armstrong number");
                    }
                    break;
                case 5: 
                    return;
            }
        }while(true);

        
    }
    
}
