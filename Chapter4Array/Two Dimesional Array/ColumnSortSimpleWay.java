import java.util.*;

public class ColumnSortSimpleWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix")
        int ms = sc.nextInt(); // 3x3 matrix
        int[][] a = new int[ms][ms];

        // Input
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Sort each column
        for (int col = 0; col < ms; col++)
        {
            int temp[] = new int[ms];
            for (int row = 0; row < ms; row++) {
                temp[row] = a[row][col];   // copy column
            }
            Arrays.sort(temp);             // sort column
            for (int row = 0; row < ms; row++) {
                a[row][col] = temp[row];   // put back
            }
        }

        // Output
        System.out.println("\nMatrix after sorting columns:");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
