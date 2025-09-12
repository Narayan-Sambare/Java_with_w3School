import java.util.*;

public class MatrixTransposeW2M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ms = 3;
        int[][] a = new int[ms][ms];

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

        // In-place transpose (swap upper triangle with lower triangle)
        for (int i = 0; i < ms; i++) {
            for (int j = i + 1; j < ms; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Display Transposed
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
