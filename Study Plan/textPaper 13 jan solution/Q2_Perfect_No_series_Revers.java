// Q2. Write a Java program to display the following series:
// 100 81 64 49 36 25 16 9 4 1
// (Perfect squares in reverse order)

import java.util.*;
public class Q2_Perfect_No_series_Revers {
    public static void main(String x[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the limit :");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            System.out.print(i*i+" ");
        }
    }
}