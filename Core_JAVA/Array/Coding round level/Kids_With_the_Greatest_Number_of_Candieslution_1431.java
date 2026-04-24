// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 

import java.util.*;
class Kids_With_the_Greatest_Number_of_Candieslution_1431{
    public static void main(String[] args) {
        List list = kidsWithCandies(new int[]{2,3,5,1,3},3);
        System.out.print(list);
    }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max=0;
        for(int i: candies)
        {
            if(i>max) max=i;     
        }
        List<Boolean> list=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            int sum=candies[i]+extraCandies;
            if(sum>=max)
            {
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}