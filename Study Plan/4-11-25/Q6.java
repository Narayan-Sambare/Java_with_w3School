// 6.Find All Pairs with Given Sum
// Concept: Use nested loops or two-pointer technique to check sums.
//  Use Case: Match contributors, tasks, etc., that add up to a budget.
// arr = [1, 5, 7, -1, 5]
// Target sum (S) = 6
// Example: Pairs with sum 6:
// (5, 1)
// (-1, 7)
// (5, 1)

public class Q6 {
    public static void main(String x[])
    {
        FindPairs fp=new FindPairs();
        int a[]={1,5,7,-1,5};
        int tg=6;
        System.out.println("Pairs with sum "+tg+" are: ");
        fp.findPairs(a,tg);
    }
}
class FindPairs
{
    void findPairs(int a[], int tg)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==tg)
                {
                    System.out.println("("+a[i]+", "+a[j]+")");
                }
            }
        }
    }
}
