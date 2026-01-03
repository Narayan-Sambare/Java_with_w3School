// 2. Merge Intervals
// Description:
// Given a list of intervals, merge all overlapping intervals and return the merged list sorted by starting time.
// Example:
// Input: [[1,3],[2,6],[8,10]]
// Output: [[1,6],[8,10]]
import java.util.*;
public class Merge_Intervals {
    public static void main(String[] x) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList list= new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" Element");
            list.add(sc.next());
        }
        
    }
}
