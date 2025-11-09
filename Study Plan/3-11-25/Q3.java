// 3.Count Frequency of Each Element
// Concept: Use nested loops or a hash map to count how often each number appears.
//  Example:  arr = [4, 5, 6, 4, 5, 7, 4]
// Output:
// Element 4 occurs 3 times 
// Element 5 occurs 2 times 
// Element 6 occurs 1 time 
// Element 7 occurs 1 time  
import java.util.HashMap;
public class Q3 
{
    public static void main(String x[]) 
    {
        int a[] = {4, 5, 6, 4, 5, 7, 4};
        countFrequency(a);
    }

    static void countFrequency(int a[])
    {
        int k=0;
        for (int i = 0; i <= 9; i++)
        {
            int count=0;
            boolean found = false;
            for (int j = 0; j < a.length; j++)
            {
                if (i == a[j])
                {
                    count++;
                }
            }
            
            if (count > 0)
            System.out.println("Element " + a[k++] + " occurs " + count + " times");
        }
        
    }
}