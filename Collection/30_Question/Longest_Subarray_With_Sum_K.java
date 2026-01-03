// 1. Longest Subarray With Sum ≤ K
// Description:
// Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
// Example:
// Input: nums=[2,3,1,2,4], k=7
// Output: 3
// Explanation: [3,1,2] has sum 6 ≤ 7.

import java.util.*;

public class Longest_Subarray_With_Sum_K{    
    public static void main(String[] x)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList nums= new ArrayList();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter "+(i+1)+" element:");
            nums.add(sc.nextInt());
        }
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        int f=0,l=0;
        int sum=0;
        for(Object num:nums)
        {
           sum+= (int)num;
           l++;
           if(sum>k)
           {
                sum-=(int)nums.get(f);
                f++; 
           }
        }
        for(int i=f;i<l;i++)
        {
            System.out.print(nums.get(i)+" ");
        }
        System.out.println("Maximum length of contiguous subarray whose sum is "+sum+"<="+ k+" is : "+(l-f));
    }
}
