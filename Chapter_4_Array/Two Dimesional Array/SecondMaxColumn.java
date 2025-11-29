/*
Q5. WAP to create 3 x 3 matrix and find the second max from every column.
*/

import java.util.*;

public class SecondMaxColumn 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix Size");
        int ms = sc.nextInt();
        int[][] a = new int[ms][ms];

        // Input matrix
        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < ms; i++)
        {
            for (int j = 0; j < ms; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < ms; i++)
        {
            for (int j = 0; j < ms; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Find second maximum of each column
        System.out.println("\nSecond maximum from each column:");
        for (int i = 0; i < ms; i++)
        {
            int[] col = new int[ms];
            for (int j = 0; j < ms; j++)
            {
                col[j] = a[j][i];  // take column elements
            }
            Arrays.sort(col); // sort column
            System.out.println("Column " + (i + 1) + " -> " + col[ms - 2]); // 2nd largest
        }
    }
}
