// 3.Write program to character from keyboard and check character is alphabet digit or special symbols?

import java.util.*;
public class Q3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } 
        else {
            System.out.println(ch + " is a Special Symbol.");
        }
        
    }
}
