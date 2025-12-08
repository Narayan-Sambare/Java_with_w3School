public class Q1 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++)
        {
            int val = 1;

            // Print spaces for center alignment
            for (int s = n - i; s > 0; s--) 
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) 
            {
                System.out.print(val);

                // Calculate next value for palindrome
                if (j < i) {
                    val++;
                } else {
                    val--;
                }
            }

            System.out.println();
        }
    }
}
