/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray()
void sortArray(int arr[])
Logic: Use Two Pointers with One Loop (Gnome Sort style)
*/

import java.util.*;

public class ArraySort1 {
    static Scanner sc = new Scanner(System.in);
    int arr1[];

    public static void main(String x[]) {
        ArraySort1 s = new ArraySort1();
        s.inputArray();
        s.sortArray(s.arr1);   // pass stored array
    }

    void inputArray() {
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr1 = arr;
    }

    void sortArray(int arr[]) {
        int i = 0;   // pointer 1
        while (i < arr.length - 1)
			{  // only one loop
				if (arr[i] > arr[i + 1])
				{
					// swap arr[i] and arr[i+1]
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					// step back (if not at start)
					if (i > 0)
					{
						i--;
					}
				} 
				else 
				{
					i++;
				}
        }

        // Print sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
