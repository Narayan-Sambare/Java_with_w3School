// Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
//  Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
// What you practice:
// Modular arithmetic
// Using temporary lists
// Index manipulation
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter number of elements in the ArrayList: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            list.add(sc.nextInt());
        }

        System.out.println("Enter the value of k (positions to rotate): ");
        int k = sc.nextInt();
        if(k>n)
        {
            System.out.println("k should be less than or equal to number of elements");
            return;
        }
        
        ArrayList<Integer> rotatedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rotatedList.add(list.get((i + k) % n));
        }
        System.out.println("Original ArrayList: " + list);
        System.out.println("ArrayList after rotating by " + k + " positions: " + rotatedList);
    }
}
