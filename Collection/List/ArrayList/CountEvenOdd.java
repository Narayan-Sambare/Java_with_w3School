// Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
// Explanation:
//  This helps practice:
// Modulus operator %
// Condition-based counting
// Iteration over collections
import java.util.*;
public class CountEvenOdd {
    public static void main(String x[])
    {
        ArrayList<Integer> a=new ArrayList();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a.add(sc.nextInt());
        }
        int ec=0,oc=0;
        for(int i:a)
        {
            if(i%2==0)
            {
                ec++;
            }
            else{
                oc++;
            }
        }
        System.out.println("Even count : "+ec);
        System.out.println("Odd count : "+oc);
    }
}
