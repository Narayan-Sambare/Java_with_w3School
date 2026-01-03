
/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;

public class Q3 {
    public static void main(String[] x) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(23);
        list.add(67);
        list.add(12);
        list.add(34);

        // Convert ArrayList to Vector
        Vector<Integer> v = new Vector<>(list);

        System.out.println("Before sorting: " + v);
        sortVector(v);
        System.out.println("After sorting: " + v);
    }

    public static void sortVector(Vector<Integer> vec) {
        int n = vec.size();
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n-i-1; j++) 
            {
                if (vec.get(j) > vec.get(j + 1)) 
                {
                    int temp = vec.get(j);
                    vec.set(j, vec.get(j + 1));
                    vec.set(j + 1, temp);
                }
            }
        }
    }
}