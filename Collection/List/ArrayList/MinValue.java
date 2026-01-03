// Q4. Create an ArrayList and find the minimum element.
// Explanation:
//  Similar to max logic, this improves:
// Conditional checking
// Traversal logic
import java.util.*;
public class MinValue {
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        int min=Integer.MAX_VALUE;
        for(int i:a)
        {
            if(i<min)
            {
                min=i;
            }
        }
         System.out.println("Max value form Array List :"+min);
        
    }
}
