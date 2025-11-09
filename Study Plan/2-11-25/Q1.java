// 1.Write program to input two values using command line argument and perform its swapping?

public class Q1 {
    public static void main(String x[])
    {
        int firstValue = Integer.parseInt(x[0]);
        int secondValue = Integer.parseInt(x[1]);

        System.out.println("Before Swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);

        // Swapping the values
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        System.out.println("After Swapping:");
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
    }
}
