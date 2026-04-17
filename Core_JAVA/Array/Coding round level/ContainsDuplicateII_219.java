import java.util.*;
public class ContainsDuplicateII_219 {
public static void main(String[] args) {
    System.out.print(containsNearbyDuplicate(new int[]{1,1,0,3,1},3));
}

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(i - map.get(nums[i])<=k) return true;
            }
                map.put(nums[i],i);
            
        }
        return false;
    }
}