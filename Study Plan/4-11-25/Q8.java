// 8. Rearrange Array in Alternate Positive and Negative Items
// Concept: Use auxiliary arrays or index manipulation to interleave.
//  Use Case: Alternate scheduling, balancing data flow.
// Input: arr = [2, 3, -4, -1, 6, -9]
 
// Separate positives: [2, 3, 6]
// Separate negatives: [-4, -1, -9]
// Rearranged array: [2, -4, 3, -1, 6, -9]

import java.util.*;
public class Q8
{
    public static void main(String x[])
    {
        int a[]={2,3,-4,-1,6,-9};
        RearrangeArray ra=new RearrangeArray();
        ra.rearrange(a);
    }
}