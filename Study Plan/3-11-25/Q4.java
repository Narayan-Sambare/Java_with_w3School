// 4.Reverse an Array
// Concept: Swap elements from both ends moving toward the center.
//  Use Case: Invert order of operations or list of commands.
// Example: arr = [10, 20, 30, 40, 50]
// Reversed array: [50, 40, 30, 20, 10]
public class Q4 
{
    public static void main(String x[]) 
    {
        int a[] = {10, 20, 30, 40, 50};
        reverseArray(a);
        System.out.print("Reversed array: ");
        for (int i=0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void reverseArray(int a[])
    {
        int left = 0;
        int right = a.length - 1;
        while (left < right) 
        {
            // Swap elements
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}