// Q5. Given a sorted array (may contain duplicates), find the first and last index of a given
// number x using binary search.
// Example:
// arr = [2, 4, 4, 4, 6, 7, 9], x = 4
// Output: First = 1, Last = 3
// Explanation :
// • Modify binary search:
// o To find first occurrence, if arr[mid] == x, move left to check more
// occurrences.
// o To find last occurrence, if arr[mid] == x, move right to check more
// occurrences.
// • This requires two binary searches.

import java.util.*;
public class Q5_FirstAndLastIndex{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int [n];

        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to find first and last index:");
        int key=sc.nextInt();
        if(key<0 || key>=n)
        {
            System.out.println("Invalid Input");
            return;
        }
        while(true)
        {
            int first=firstIndex(a,key);
            int last=lastIndex(a,key);
            System.out.println("First Index = "+first+", Last Index = "+last);
            break;
        }
    }
    static int firstIndex(int a[],int key)
    {
        int f=0,l=a.length-1;
        int result=-1;
        while(f<=l)
        {
            int mid=f+(l-f)/2;
            if(a[mid]==key)
            {
                result=mid;
                l=mid-1; // Move left to find earlier occurrence
            }
            else if(a[mid]<key)
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }
        return result;
    }
    static int lastIndex(int a[],int key)
    {
        int f=0,l=a.length-1;
        int result=-1;
        while(f<=l)
        {
            int mid=f+(l-f)/2;
            if(a[mid]==key)
            {
                result=mid;
                f=mid+1; // Move right to find later occurrence
            }
            else if(a[mid]<key)
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }
        return result;
    }
}