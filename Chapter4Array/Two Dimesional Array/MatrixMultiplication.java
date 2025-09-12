
// Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix


import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix");
        int ms = sc.nextInt(); // 3x3 matrix

        int a[][]= new int[ms][ms];
        int b[][]= new int[ms][ms];
        int c[][]= new int[ms][ms]; // result

        // Input Matrix A
       System.out.println("enter the 1st matrix element");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
      System.out.println("enter the 2nd matrix element");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < ms; i++)
        {
            for (int j = 0; j < ms; j++)
            {
                int sum = 0;
                for (int k = 0; k < ms; k++) {
                    sum=sum + a[i][k] * b[k][j];
                }
                c[i][j]=sum;
            }
        }

        // Display final matrix
        System.out.println("\n display result Matrix :");
        for (int i = 0; i < ms; i++) {
            for (int j = 0; j < ms; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
