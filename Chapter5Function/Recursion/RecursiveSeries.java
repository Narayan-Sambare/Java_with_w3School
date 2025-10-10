import java.util.*;

public class RecursiveSeries {
    
    // Recursive function
    static void printSeries(int term, int diff, int n) {
        if (n == 0)
            return;
        
         System.out.print(term + " ");
        // Next term = current term + diff
        printSeries(term + diff, diff + 2, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Start from 7 with initial difference 3
        printSeries(7, 3, n);
    }
}
