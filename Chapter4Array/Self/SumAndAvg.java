
//Q2. Write a java program to Calculate the Sum and Average of Elements
import java.util.*;

public class SumAndAvg {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the " + i + " element");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b = b + a[i];
        }
        float avg= (float)b/a.length;
        System.out.println("sum of array Element-->" + b);
        System.out.println("average of array Element-->" + avg);

    }
}