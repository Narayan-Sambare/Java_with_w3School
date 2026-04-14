import java.util.*;

class HillAndValley {

    public static void main(String x[])
    {
        System.out.println(countHillValley(new int[]{9,8,7,6,5}));
        System.out.println(countHillValley1(new int[]{9,8,7,6,5}));
    }
    public static int countHillValley(int[] arr) {
       int count=0;

       List<Integer> list= new ArrayList<>();
       list.add(arr[0]);

       for(int i=1;i<arr.length;i++){
        if(arr[i-1]!=arr[i]) list.add(arr[i]);
       }
       int nums[]=list.stream().mapToInt(i->i).toArray();

       for(int i=1;i<nums.length-1;i++){
            if( nums[i]>nums[i-1] && nums[i]>nums[i+1] ) count++;
            else if(nums[i]<nums[i-1] && nums[i]<nums[i+1]) count++;
       }
    return count;
    }

    static int countHillValley1(int[] nums) {
        int hill=0,valley=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]<nums[i] && (nums[i]>nums[i+1])) hill++;
            else if(nums[i-1]>nums[i] && (nums[i]<nums[i+1])) valley++;
            else if(nums[i]==nums[i+1])
            {
            int k=i;
                while(nums[k]==nums[i] && k<nums.length-1)
                {
                    k++;
                }
                if(nums[i-1]<nums[i] && (nums[i]>nums[k])) hill++;
            else if(nums[i-1]>nums[i] && (nums[i]<nums[k])) valley++;
            }
        }
        return valley+hill;
    }

}
    