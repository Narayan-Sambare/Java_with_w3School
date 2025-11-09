// 10.Write program to input number using Scanner class and check this number duck or not?

import java.util.*; 
public class Q10
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean result=isDuck(n);

        if (result) {
            System.out.println(n + " is a Duck Number.");
        } else {
            System.out.println(n + " is not a Duck Number.");
        }
    }
    static boolean isDuck(int n)
    {
        while (n > 0)
        {
            if (n % 10 == 0)
            {
                return true;
            }
            n = n / 10;
        }
       
        return false;
    }
}