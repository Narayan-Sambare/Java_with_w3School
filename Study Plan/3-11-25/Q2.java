// 2.Search for an Element (Linear Search)
// Concept: Traverse array linearly and compare each value with the target.
  
// arr = [10, 20, 30, 40, 50]
// Enter search key  : 30
// Output: value found
// Enter search key: 300
// Output: value not found 

import java.util.Scanner;
public class Q2 
{
    public static void main(String x[]) 
    {
        int a[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search key: ");
        int key = sc.nextInt();
        boolean found = Search(a, key);
        if (found) {
            System.out.println("value found");
        } else {
            System.out.println("value not found");
        }
    }

    static boolean Search(int a[], int key) {
        for (int i =0; i < a.length; i++) 
        {
            if (a[i] == key) {
                return true;
            }
        }
        return false;
    }
}