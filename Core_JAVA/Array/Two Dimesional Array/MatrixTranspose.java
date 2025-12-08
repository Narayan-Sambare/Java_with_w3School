// Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row

import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ms = 3; // 3x3 matrix
        int[][] a = new int[ms][ms];
        int[][] t = new int[ms][ms];

        // Input
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Display Original
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose logic: swap row & column
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                t[j][i] = a[i][j];
            }
        }

        // Display Transpose
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}
