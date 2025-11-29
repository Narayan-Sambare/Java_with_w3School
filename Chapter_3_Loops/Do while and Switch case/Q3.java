// Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
// 1.Check if the character is an alphabet.
// 2.If alphabet, check vowel or consonant.
// 3.If digit, check even or odd.
// 4.Convert uppercase to lowercase or vice versa.
// 5.Exit the program

import java.util.*;
public class Q3 {
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter Your Choice");
        System.out.println("1.Check if the character is an alphabet");
        System.out.println("2.If alphabet, check vowel or consonant");
        System.out.println("3.If digit, check even or odd");
        System.out.println("4.Convert uppercase to lowercase or vice versa");
        System.out.println("5.Exit");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("This code for Check if the character is an alphabet\n\n");

                System.out.println("Enter the kay");
                char c=sc.next().charAt(0);
                int a=(int)c;  
                if((a>=65 && a<=90)||(a>=97 && a<=122))
                {
                    System.out.println("Alphabet\n\n");
                }  
                else
                {
                     System.out.println(" Not Alphabet\n\n");    
                }           
                break;
            case 2: 
                System.out.println("This code for If alphabet, check vowel or consonant\n\n");
                System.out.println("Enter any alphabet");
                c=sc.next().charAt(0);
                if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
                     System.out.println("vovel\n\n");
                    }
                    else{
                         System.out.println("consonant\n\n");
                    }
                break;
            case 3:
                System.out.println("This code for If digit, check even or odd\n\n");
                System.out.println("Enter the digit");
                int n=sc.nextInt();
                if(n%2==0)
                {
                    System.out.println("Digit is Even\n\n");
                }
                else{
                     System.out.println("Digit is Odd\n\n");
                }
                break;
            case 4:
                System.out.println("This code for Convert uppercase to lowercase or vice versa\n\n");
                System.out.println("Enter the kay");
                c=sc.next().charAt(0);
                a=(int)c; 
                if(a>=65 && a<=90) 
                {
                    a=a+32;
                    char h=(char)a;
                    System.out.println(c+"-->"+h);
                }
                else
                {
                    a=a-32;
                    char h=(char)a;
                    System.out.println(c+"-->"+h);
                }
                break;
            case 5:
                return;
        }

        }while(true);
    }
}
