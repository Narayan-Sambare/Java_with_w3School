// 7.Find Majority Element (Occurs > n/2 Times)
// Concept: Use count method or Boyer-Moore Voting Algorithm.
//  Use Case: Identify the dominating product, preference, etc.
// Inut : arr = [2, 2, 1, 1, 2, 2, 2]
// Size (n) = 7
// Majority element is: 2

public class Q7 {
    public static void main(String x[])
    {
        int a[]={2,2,1,1,2,2,2};
        MajorityElement me=new MajorityElement();
        me.findMajority(a);
    }
}
class MajorityElement
{
    void findMajority(int a[])
    {
       
        int maxCount = 0;
        int index = -1; 
        for (int i = 0; i < a.length; i++) 
        {
            int count = 0;
            for (int j = 0; j < a.length; j++) 
            {
                if (a[i] == a[j])
                    count++;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > a.length / 2)
        {
            System.out.println("Majority element is: " + a[index]);
            System.out.println("Count of Majority Element: " + maxCount);

        }
        else {
            System.out.println("No Majority Element");
        }
    }
}
