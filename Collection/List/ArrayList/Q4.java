/*
Q4. Take an integer array with repeated values.
Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
import java.util.*;
public class Q4 {
    public static void main(String[] x) 
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> visit=new ArrayList<>();
    
        System.out.println("Enter array value");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int num : arr) 
        {
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) 
        {
            int num = list.get(i);
            if (visit.contains(num)) 
            {
                continue;
            }
            int count = 0;
            for(Object obj:list){
                if ((int)obj == num) count++;
            }
            visit.add(num); // mark as counted
            System.out.println("Frequency of " + num + " = " + count);
        }
    }
}
        // for(int i=0;i<10;i++)
        // {   int c=0,v=0;
        //     for(Object obj : list) 
        //     {
        //         if(i==(int)obj)
        //         {
        //             c++;
        //             v=(int)obj;
        //         }
        //     }
        //     if(c>0)
        //     {
        //         System.out.println("frequency of "+v+" is "+c);
        //     }
        // }    
