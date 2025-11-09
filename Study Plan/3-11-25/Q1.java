// 1. Average of Elements
// Concept: First compute the sum, then divide by the number of elements.
//  arr = [10, 20, 30, 40, 50]
// Average of array elements: 30.0

public class Q1 
{
    public static void main(String x[]) 
    {
        int a[] = {10, 20, 30, 40, 50};
        double average = calculateAverage(a);
        System.out.println("Average of array elements: " + average);
    }

    static double calculateAverage(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }
}