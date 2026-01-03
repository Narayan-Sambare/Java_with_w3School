// Q6. Write a java program to Check whether a given number exists in an ArrayList.
// Explanation:
//  You learn:
// Linear search logic
// Use of flag variable
// Comparison using loop
import java.util.*;
public class SearchNoUsingLinearSearch {
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for arrayList :");
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println("Enter the Search Key :");
        int key=sc.nextInt();
        
        System.out.println(a.contains(key)?"Key found ":"key Not found ");
    
        

    }
}
