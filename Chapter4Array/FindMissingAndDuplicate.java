import java.util.Scanner;

public class FindMissingAndDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements (numbers from 1 to " + n + "):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = -1;
        int missing = -1;

        // Step 1: Find duplicate
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break;
                }
            }
        }

        // Step 2: Find missing
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }
        }

        System.out.println("Duplicate = " + duplicate + ", Missing = " + missing);
    }
}
