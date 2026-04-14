class MonotonicArray {
    public static void main(String x[])
    {
        System.out.println(isMonotonic(new int[]{9,8,7,6,5}));
    }
    static boolean isMonotonic(int[] nums) {
        if(nums[0]<nums[nums.length-1])
        {
            for(int i=0;i<nums.length-1;i++)
                if(nums[i]>nums[i+1])return false;            
        }
        else
        {
            for(int i=0;i<nums.length-1;i++)
                if(nums[i]<nums[i+1])return false;
                
        }
        return true;
    }
}